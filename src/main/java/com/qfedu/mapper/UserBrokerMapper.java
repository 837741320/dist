package com.qfedu.mapper;

import com.qfedu.pojo.Broker;
import com.qfedu.pojo.UserBroker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBrokerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBroker record);

    int insertSelective(UserBroker record);

    UserBroker selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBroker record);

    int updateByPrimaryKey(UserBroker record);

    List<Broker> selectbroker(int uid);
}