package com.bcilab.neurotales.controller;
// Description: 会话控制器


import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.service.SessionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
@Tag(name = "会话控制器")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @Operation(summary = "根据数据集Id查询会话")
    @GetMapping("/info")
    public CommonResult findById(@RequestParam ObjectId id) {
        return sessionService.findById(id);
    }
}
