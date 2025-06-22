package com.bcilab.neurotales.model.dto;
// Description: TODO

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private ObjectId sessionObjectId;

    @NotBlank(message = "会话名称不能为空")
    private String sessionName;
}
