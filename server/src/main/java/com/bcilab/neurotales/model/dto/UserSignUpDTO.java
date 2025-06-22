package com.bcilab.neurotales.model.dto;

import com.bcilab.neurotales.utils.GenderConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Schema(name = "用户注册DTO")
public class UserSignUpDTO {
    // 复用相同验证规则
    @NotBlank
    @Length(min = 4, max = 15)
    @Pattern(regexp = "^[a-zA-Z0-9_\u4e00-\u9fa5]+$")
    @Schema(description = "账号名")
    private String accountId;

    @NotBlank
    @Length(min = 4, max = 15)
    @Pattern(regexp = "^[a-zA-Z0-9_]+$")
    @Schema(description = "密码")
    private String password;

    @Schema(description = "性别 - male(0), female(1)")
    private byte gender;

    public String getGender() {
        return GenderConstants.toString(this.gender);
    }

    public void setGender(String gender) {
        this.gender = GenderConstants.fromString(gender);
    }

    @Schema(description = "出生日期")
    private LocalDate birthDate;
}