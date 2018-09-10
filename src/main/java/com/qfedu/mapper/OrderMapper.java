package com.qfedu.mapper;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orederId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orederId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    JsonVo selectOrder(Integer oid);
}