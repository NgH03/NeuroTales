package com.bcilab.neurotales.model.context;
// Description: 用户的登录信息

import org.bson.types.ObjectId;

public record LoginUserContext (

    ObjectId userObjectId,

    String username

){}
