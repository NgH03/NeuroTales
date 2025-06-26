package com.bcilab.neurotales.model.dto;
// Description: 用户登录DTO

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Data
@Schema(name = "用户登录DTO")
public class UserSignInDTO {
    @NotBlank
    @Length(min = 4, max = 15, message = "账号长度需在4至15之间")
    @Pattern(regexp = "^[a-zA-Z0-9_\u4e00-\u9fa5]+$", message = "账号名仅支持中、英文和下划线")
    @Schema(description = "账号名")
    private String username;

    @NotBlank
    @Length(min = 4, max = 15, message = "账号长度需在4至15之间")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$")
    @Schema(description = "密码")
    private String password;
}
