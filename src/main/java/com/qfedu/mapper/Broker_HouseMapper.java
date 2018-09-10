package com.qfedu.mapper;

import com.qfedu.pojo.Broker_House;

public interface Broker_HouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Broker_House record);

    int insertSelective(Broker_House record);

    Broker_House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Broker_House record);

    int updateByPrimaryKey(Broker_House record);
}