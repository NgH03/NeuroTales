package com.bcilab.neurotales.mapstruct.dataset;

import com.bcilab.neurotales.mapstruct.BaseMapper;
import com.bcilab.neurotales.model.dto.DatasetInfoDTO;
import com.bcilab.neurotales.model.po.Dataset;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DatasetInfoMapper extends BaseMapper<Dataset, DatasetInfoDTO> {
//    DatasetInfoMapper INSTANCE = Mappers.getMapper(DatasetInfoMapper.class);
}