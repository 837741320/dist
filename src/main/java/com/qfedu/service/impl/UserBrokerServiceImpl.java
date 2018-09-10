package com.qfedu.service.impl;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.mapper.UserBrokerMapper;
import com.qfedu.pojo.Broker;
import com.qfedu.pojo.User;
import com.qfedu.pojo.UserBroker;
import com.qfedu.service.UserBrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBrokerServiceImpl implements UserBrokerService {
    @Autowired
    private UserBrokerMapper userBrokerMapper;
    @Override
    public JsonVo save(UserBroker userBroker) {
        int insert = userBrokerMapper.insert(userBroker);
        if (insert>0){
            return JsonVo.R(1,"添加经纪人成功",null);
        }
        return JsonVo.R(0,"添加经纪人失败",null);
    }
    @Override
    public JsonVo delete(UserBroker userBroker){
        int i = userBrokerMapper.deleteByPrimaryKey(userBroker.getId());
        if (i>0){
            return JsonVo.R(1,"移除经纪人成功",null);
        }
        return JsonVo.R(1,"移除经纪人失败",null);
    }

    @Override
    public JsonVo listBroker(int uid) {
        List<Broker> brokers = userBrokerMapper.selectbroker(uid);
        return JsonVo.R(1,"经纪人详情展示",brokers);
    }

}
