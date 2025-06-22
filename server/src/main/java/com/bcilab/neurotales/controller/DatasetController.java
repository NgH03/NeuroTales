package com.bcilab.neurotales.controller;
// Description: 数据集控制器

import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.service.DatasetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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
    @PostMapping("/upload")
    public CommonResult uploadDataset(@RequestBody MultipartFile file){
        return datasetService.uploadDataset(file);
    }

//    @Operation(summary = "实时录制EEG数据")


//    @Operation(summary = "修改数据集名称")

    @Operation(summary = "对数据集进行预处理")
    @PostMapping("/process")
    public CommonResult processDataset(ObjectId dataSetId){
        return datasetService.processDataset(dataSetId);
    }

}
