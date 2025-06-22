package com.bcilab.neurotales.controller;
// Description: 用户控制器

import com.bcilab.neurotales.model.dto.UserInfoDTO;
import com.bcilab.neurotales.model.dto.UserSignInDTO;
import com.bcilab.neurotales.model.dto.UserSignUpDTO;
import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "用户控制器")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "根据账户名查找用户信息")
    @GetMapping("/info")
    public CommonResult findByAccountId(String accountId){
        return userService.findByAccountId(accountId);
    }

    @Operation(summary = "用户注册")
    @PostMapping("/signup")
    public CommonResult signUp(@Valid @RequestBody UserSignUpDTO userSignUpDTO) {
        return userService.signUp(userSignUpDTO);
    }

    @Operation(summary = "用户登录")
    @PostMapping("/signin")
    public CommonResult signIn(@Valid @RequestBody UserSignInDTO userSignInDTO) {
        return userService.signIn(userSignInDTO);
    }

    @Operation(summary = "更新用户信息")
    @PutMapping("/info")
    public CommonResult updateUserInfo(@Valid @RequestBody UserInfoDTO userInfoDTO) {
        return userService.updateUserInfo(userInfoDTO);
    }
}
