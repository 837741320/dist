package com.qfedu.web.controller;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.User;
import com.qfedu.pojo.UserBroker;
import com.qfedu.service.UserBrokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserBrokerController {
    @Autowired
    private UserBrokerService userBrokerService;
    //添加经济人
    @RequestMapping("adduserbroker.do")
    @ResponseBody
    public JsonVo add(UserBroker userBroker){
        return userBrokerService.save(userBroker);
    }
    //移除经济人
    //此处传id
    @RequestMapping("deletebroke.do")
    @ResponseBody
    public JsonVo deleteuserbroke(UserBroker userBroker){
        return userBrokerService.delete(userBroker);
    }

    //我的经纪人展示
    @RequestMapping("listBroker.do")
    @ResponseBody
    public JsonVo listBroker(HttpSession session){
        User user = (User) session.getAttribute("user");
        return userBrokerService.listBroker(user.getUserId());
    }
}
