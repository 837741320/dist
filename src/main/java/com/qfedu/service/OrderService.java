package com.qfedu.service;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.Order;

public interface OrderService {
    public JsonVo addOrder(Order order);

    public JsonVo deleteOrder(Integer orederId);

    public JsonVo selectOrder(int oid);
}
