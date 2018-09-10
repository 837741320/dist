package com.qfedu.mapper;

import com.qfedu.pojo.Broker;

public interface BrokerMapper {
    int deleteByPrimaryKey(Integer brokerId);

    int insert(Broker record);

    int insertSelective(Broker record);

    Broker selectByPrimaryKey(Integer brokerId);

    int updateByPrimaryKeySelective(Broker record);

    int updateByPrimaryKey(Broker record);
}