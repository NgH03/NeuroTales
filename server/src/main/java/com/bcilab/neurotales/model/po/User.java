package com.bcilab.neurotales.model.po;
// Description: 用户信息

import com.bcilab.neurotales.model.dto.DatasetInfoDTO;
import com.bcilab.neurotales.model.dto.SessionInfoDTO;
import com.bcilab.neurotales.model.entity.BaseEntity;
import com.bcilab.neurotales.utils.GenderConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document("users")
@Schema(description = "用户信息实体")
public class User extends BaseEntity {
    // 移除所有验证注解
    @Schema(description = "账号名")
    private String username;

    @Schema(description = "密码哈希")
    private String passwordHash; // 存储哈希值而非明文

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

    @Schema(description = "会话列表")
    private List<SessionInfoDTO> sessionInfos;

    @Schema(description = "数据集列表")
    private List<DatasetInfoDTO> datasetInfos;
}
