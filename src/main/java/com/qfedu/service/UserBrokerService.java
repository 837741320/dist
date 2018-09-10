package com.qfedu.service;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.User;
import com.qfedu.pojo.UserBroker;

import java.util.List;

public interface UserBrokerService {
    JsonVo save(UserBroker userBroker);
    public JsonVo delete(UserBroker userBroker);

    JsonVo listBroker(int uid);
}
