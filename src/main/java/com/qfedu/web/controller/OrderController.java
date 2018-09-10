package com.qfedu.web.controller;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.Order;
import com.qfedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/addorder.do")
    @ResponseBody
    public JsonVo addOrder(Order order){
        return orderService.addOrder(order);
    }

    @RequestMapping("/deleteorder.do")
    @ResponseBody
    public JsonVo deleteOrder(Integer orederId){return  orderService.deleteOrder(orederId);}

    @RequestMapping("/selectorder.do")
    @ResponseBody
    public  JsonVo selectOrder(Integer oid){return orderService.selectOrder(oid);}

}
