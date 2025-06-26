package com.bcilab.neurotales.service.impl;

import com.bcilab.neurotales.model.dto.DatasetInfoDTO;
import com.bcilab.neurotales.model.dto.request.CallbackRequest;
import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.repository.DatasetRepository;
import com.bcilab.neurotales.service.ChatService;
import com.bcilab.neurotales.service.DatasetService;
import com.bcilab.neurotales.utils.CommandUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class DatasetServiceImpl implements DatasetService {

    // 常量定义
    private static final long MAX_FILE_SIZE_BYTES = 100 * 1024 * 1024; // 100MB
    private static final String[] ALLOWED_EXTENSIONS = {".hdf5", ".h5"};
    private static final String DATA_DIRECTORY = "data";
    private static final int DEFAULT_CLEANUP_DELAY_MS = 100;

    // 存储任务ID与文件路径的映射
    private final Map<String, Path> taskIdToFilePathMap = new ConcurrentHashMap<>();

    @Value("${preprocess.command:python preprocess/main.py}")
    private String preprocessCommand;

    @Value("${preprocess.cleanup.delay.ms:100}")
    private int cleanupDelayMs;

    @Autowired
    private DatasetRepository datasetRepository;

    @Autowired
    private ChatService chatService;

    @Override
    public CommonResult getDataset() {
        return null;
    }

    @Override
    public CommonResult uploadDataset(MultipartFile file) {
        // 1. 验证文件
        CommonResult validationResult = validateFile(file);
        if (validationResult != null) return validationResult;

        // 2. 准备存储目录
        Path dataDir = Path.of(DATA_DIRECTORY);
        if (!createDirectoryIfNotExists(dataDir)) {
            return CommonResult.fail("服务器存储目录创建失败");
        }

        // 3. 生成唯一文件名和任务ID
        String originalFilename = file.getOriginalFilename();
        String filename = generateUniqueFilename(originalFilename);
        Path targetPath = dataDir.resolve(filename);
        String taskId = UUID.randomUUID().toString();

        // 4. 保存文件
        if (!saveFile(file, targetPath)) {
            return CommonResult.fail("文件上传失败");
        }

        // 5. 存储任务ID映射
        taskIdToFilePathMap.put(taskId, targetPath);
        log.info("放进去的 taskId："+ taskId);
        // 6. 启动异步处理
        processDatasetAsync(targetPath, taskId);

        return CommonResult.accepted("文件预处理中", Map.of(
                "taskId", taskId,
                "filename", filename
        ));
    }

    @Override
    public CommonResult saveDataset(CallbackRequest callbackRequest) {
        log.info("参数参数："+callbackRequest);
        // 1. 验证请求
        if (callbackRequest == null || callbackRequest.getTaskId() == null) {
            return CommonResult.fail("无效的回调请求");
        }

        String requestTaskId = callbackRequest.getTaskId();
        log.info("返回来的的taskId: "+requestTaskId);
        // 2. 获取文件路径
        Path filePath = taskIdToFilePathMap.get(requestTaskId);

        // 3. 检查任务ID一致性
        if (filePath == null) {
            log.warn("找不到与任务ID关联的文件: {}", requestTaskId);
            return CommonResult.fail("无效的任务ID");
        }

        // 4. 延迟处理（模拟等待）
        try {
            TimeUnit.MILLISECONDS.sleep(cleanupDelayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            log.warn("清理延迟被中断", e);
        }

        // 5. 根据处理结果处理文件
        if (callbackRequest.getIsSuccess()) {
            handleSuccess(callbackRequest, filePath);
            return CommonResult.success("预处理结果保存成功");
        } else {
            handleFailure(requestTaskId, filePath);
            return CommonResult.fail("预处理失败");
        }
    }

    @Async("taskExecutor")
    public void processDatasetAsync(Path filePath, String taskId) {
        // 1. 验证文件存在
        if (!validateFileExists(filePath)) {
            log.error("预处理失败: 文件不存在 - {}", filePath);
            return;
        }

        // 2. 验证文件可读
        if (!Files.isReadable(filePath)) {
            log.error("预处理失败: 文件不可读 - {}", filePath);
            return;
        }

        // 3. 执行预处理命令
        String command = String.format("%s -p %s -t %s", preprocessCommand, filePath, taskId);

        try {
            CommandUtils.OutputHandler handler = new CommandUtils.OutputHandler() {
                @Override
                public void handleOutput(String line) {
                    log.info("[Preprocess] {}", line);
                }

                @Override
                public void handleError(Exception e) {
                    log.error("预处理输出流错误", e);
                }
            };

            CommandUtils.exec(command, handler);
            log.info("预处理任务启动: taskId={}, file={}", taskId, filePath.getFileName());
        } catch (Exception e) {
            log.error("执行预处理命令错误: {}", command, e);
        }
    }

    private CommonResult validateFile(MultipartFile file) {
        if (file == null || file.isEmpty()) {
            return CommonResult.fail("文件不能为空");
        }

        if (file.getSize() > MAX_FILE_SIZE_BYTES) {
            return CommonResult.fail("文件大小不能超过100MB");
        }

        String originalFilename = file.getOriginalFilename();
        if (originalFilename == null) {
            return CommonResult.fail("无效的文件名");
        }

        String lowerFilename = originalFilename.toLowerCase();
        boolean validExtension = false;
        for (String ext : ALLOWED_EXTENSIONS) {
            if (lowerFilename.endsWith(ext)) {
                validExtension = true;
                break;
            }
        }

        if (!validExtension) {
            return CommonResult.fail("仅支持.h5或.hdf5格式文件");
        }

        return null;
    }

    private boolean createDirectoryIfNotExists(Path directory) {
        try {
            if (!Files.exists(directory)) {
                Files.createDirectories(directory);
            }
            return true;
        } catch (IOException e) {
            log.error("创建目录失败: {}", directory, e);
            return false;
        }
    }

    private String generateUniqueFilename(String originalFilename) {
        return UUID.randomUUID() + "_" + originalFilename;
    }

    private boolean saveFile(MultipartFile file, Path targetPath) {
        try (InputStream inputStream = file.getInputStream()) {
            Files.copy(inputStream, targetPath, StandardCopyOption.REPLACE_EXISTING);
            log.info("文件保存成功: {}", targetPath);
            return true;
        } catch (IOException e) {
            log.error("文件保存失败", e);
            return false;
        }
    }

    private boolean validateFileExists(Path filePath) {
        if (!Files.exists(filePath)) {
            log.error("预处理失败: 文件不存在 - {}", filePath);
            return false;
        }
        return true;
    }

    @Async("taskExecutor")
    protected void handleSuccess(CallbackRequest callbackRequest, Path filePath) {
        try {
            // TODO: 保存处理结果到数据库

            log.info("开始AI分析: taskId={}, file={}", callbackRequest.getTaskId(), filePath.getFileName());
            CommonResult commonResult = chatService.chatEi(callbackRequest);
            log.info(commonResult.getMessage());
        } catch (Exception e) {
            log.error("保存预处理结果失败", e);
        } finally {
            // 清理任务ID映射
            taskIdToFilePathMap.remove(callbackRequest.getTaskId());
        }
    }

    private CommonResult handleFailure(String taskId, Path filePath) {
        try {
            // 删除源文件
            Files.deleteIfExists(filePath);
            log.info("预处理失败，已删除文件: taskId={}, file={}", taskId, filePath.getFileName());
            return CommonResult.fail("预处理失败，文件已删除");
        } catch (IOException e) {
            log.error("删除文件失败: {}", filePath, e);
            return CommonResult.fail("删除文件失败");
        } finally {
            // 清理任务ID映射
            taskIdToFilePathMap.remove(taskId);
        }
    }
}