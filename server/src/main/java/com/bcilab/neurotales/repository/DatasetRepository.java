package com.bcilab.neurotales.repository;
// Description: 数据集仓储接口

import com.bcilab.neurotales.model.po.Dataset;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatasetRepository extends MongoRepository<Dataset, ObjectId> {
}
