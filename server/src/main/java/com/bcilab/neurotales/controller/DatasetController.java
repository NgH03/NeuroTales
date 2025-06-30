package com.bcilab.neurotales.controller;
// Description: 数据集控制器

import com.bcilab.neurotales.model.dto.DatasetResultDTO;
import com.bcilab.neurotales.model.dto.request.CallbackRequest;
import com.bcilab.neurotales.model.po.Dataset;
import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.service.DatasetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/dataset")
@Tag(name = "数据集控制器")
public class DatasetController {

    @Autowired
    private DatasetService datasetService;

    @Operation(summary = "获取数据集信息")
    @GetMapping("/info")
    public CommonResult getDataset(){
        return datasetService.getDataset();
    }

    @Operation(summary = "上传hd5f数据集")
    @PostMapping(
            value = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public CommonResult uploadDataset(
            @Parameter(description = "HDF5格式数据集文件")
            @RequestPart("file") MultipartFile file){
        return datasetService.uploadDataset(file);
    }
    @GetMapping(value = "get")
    public CommonResult getResultBytASKid( String taskId){
        return datasetService.getResult(taskId);
    }

    @Operation(summary = "确认任务完成并传输结果回调接口")
    @PostMapping(value = "/callback")
    public CommonResult doneDataset(@RequestBody CallbackRequest callbackRequest){
        return datasetService.saveDataset(callbackRequest);
    }


//    @Operation(summary = "实时录制EEG数据")


//    @Operation(summary = "修改数据集名称")

//    @Operation(summary = "对数据集进行预处理")
//    @PostMapping("/process")
//    public CommonResult processDataset(String datasetPath){
//        return datasetService.processDataset(datasetPath);
//    }

}
