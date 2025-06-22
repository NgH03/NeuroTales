package com.bcilab.neurotales.mapstruct.user;
// Description: TODO

import com.bcilab.neurotales.mapstruct.BaseMapper;
import com.bcilab.neurotales.model.dto.UserSignUpDTO;
import com.bcilab.neurotales.model.po.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSignUpMapper extends BaseMapper<User, UserSignUpDTO> {
    UserSignUpMapper INSTANCE = Mappers.getMapper(UserSignUpMapper.class);
}