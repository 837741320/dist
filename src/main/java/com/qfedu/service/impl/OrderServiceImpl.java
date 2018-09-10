package com.qfedu.service.impl;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.mapper.OrderMapper;
import com.qfedu.pojo.Order;
import com.qfedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public JsonVo addOrder(Order order) {
        int insert = orderMapper.insert(order);
        if (insert>0){
            return JsonVo.R(1,"添加订单成功",null);
        }
        return JsonVo.R(1,"添加订单失败",null);
    }

    @Override
    public JsonVo deleteOrder(Integer orederId) {
        int i = orderMapper.deleteByPrimaryKey(orederId);
        if (i>0){
            return JsonVo.R(1,"删除成功",null);
        }

        return JsonVo.R(1,"删除订单失败",null);
    }

    @Override
    public JsonVo selectOrder(int oid) {
        return orderMapper.selectOrder(oid);
    }


}
