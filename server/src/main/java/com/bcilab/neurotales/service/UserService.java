package com.bcilab.neurotales.service;


import com.bcilab.neurotales.model.dto.UserInfoDTO;
import com.bcilab.neurotales.model.dto.UserSignInDTO;
import com.bcilab.neurotales.model.dto.UserSignUpDTO;
import com.bcilab.neurotales.model.response.CommonResult;

public interface UserService {

    CommonResult signUp(UserSignUpDTO userSignUpDTO);

    CommonResult signIn(UserSignInDTO userSignInDTO);

    CommonResult findByAccountId(String accountId);

    CommonResult updateUserInfo(UserInfoDTO userInfoDTO);
}
