package com.bcilab.neurotales.mapstruct;


import org.mapstruct.MappingTarget;

public interface BaseMapper<PO, DTO> {
    public abstract PO toPO(DTO dto);
    public abstract DTO toDTO(PO po);

    // 通用更新方法（可选）
//    public abstract void updateFromDTO(DTO dto, @MappingTarget PO po);
}