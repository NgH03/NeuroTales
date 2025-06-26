package com.bcilab.neurotales.service.impl;

import com.bcilab.neurotales.mapstruct.user.UserSignUpMapper;
import com.bcilab.neurotales.model.dto.UserInfoDTO;
import com.bcilab.neurotales.model.dto.UserSignInDTO;
import com.bcilab.neurotales.model.dto.UserSignUpDTO;
import com.bcilab.neurotales.model.po.User;
import com.bcilab.neurotales.model.response.CommonResult;
import com.bcilab.neurotales.repository.UserRepository;
import com.bcilab.neurotales.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mapping.MappingException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public CommonResult signUp(UserSignUpDTO userSignUpDTO) {
        if (userSignUpDTO == null) {
            log.error("userSignUpDTO is null");
            return CommonResult.fail("注册信息不能为空!");
        }

        try {
            // 把DTO转到User表
            User user = UserSignUpMapper.INSTANCE.toPO(userSignUpDTO);
            user.setDatasetInfos(new ArrayList<>());
            user.setSessionInfos(new ArrayList<>());
            // 存入MongoDB
            userRepository.save(user);
            return CommonResult.success("注册成功！");
        }catch (MappingException e) {
            log.error("DTO mapping failure", e);
            return CommonResult.fail("数据格式错误");
        } catch (Exception e) {
            log.error(e.getMessage());
            return CommonResult.fail("注册失败" + e.getMessage());
        }

    }

    @Override
    public CommonResult login(UserSignInDTO userSignInDTO) {
        //
        return null;
    }

    @Override
    public CommonResult findByAccountId(String accountId) {
        return null;
    }

    @Override
    public CommonResult updateUserInfo(UserInfoDTO userInfoDTO) {
        return null;
    }
}
