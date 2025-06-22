package com.bcilab.neurotales.model.dto;
// Description: TODO

import com.bcilab.neurotales.utils.GenderConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "用户信息DTO")
public class UserInfoDTO{

    @Schema(description = "账号名")
    private String accountId;

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

    @Schema(description = "年龄")
    private Integer age;

}
