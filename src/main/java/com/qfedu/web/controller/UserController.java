package com.qfedu.web.controller;
import com.qfedu.common.utils.RandUtil;
import com.qfedu.common.utils.RedisUtil;
import com.qfedu.common.utils.miaodiyun.httpApiDemo.IndustrySMS;
import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.User;
import com.qfedu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class UserController {

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private UserServiceImpl service;
    //发送验证码
    @RequestMapping("/getphone.do")
    @ResponseBody
    public JsonVo sendActive(String phone, HttpServletRequest request){
        String uuid = RandUtil.getRandNum();
        boolean boo = redisUtil.set("uuid", uuid);
        redisUtil.expire("uuid",1800);
        if (boo){String smsContent ="【千峰教育练习】您的验证码为"+ uuid +"，请于30分钟内正确输入，如非本人操作，请忽略此短信。";
            IndustrySMS.execute(phone,smsContent);
            return JsonVo.R(1,"发送成功",null);
        }else {
            return JsonVo.R(0,"发送失败",null);
        }
    }
    //用户名校验
    @RequestMapping("/checkphone.do")
    @ResponseBody
    public JsonVo checkPhone(String phone){
        return service.checkUser(phone);
    }

    //用户注册
    @RequestMapping("/usersave.do")
    @ResponseBody
    public  JsonVo register(User use){
        return service.save(use);
    }

    //用户登录
    @RequestMapping("/loginuser.do")
    @ResponseBody
    public JsonVo userLogin(String phone, String password, HttpSession session){
        return service.loginUser(phone,password,session);
    }
    //用户展示
    @RequestMapping("listuser.do")
    @ResponseBody
    public JsonVo listUser(HttpSession session){
        Object user = session.getAttribute("user");
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(user);
        return JsonVo.R(1,"用户展示",obj);
    }

    //用户信息修改
    @RequestMapping("updateuser.do")
    @ResponseBody
    public JsonVo updateuser(User user){
        return service.updateuser(user);
    }

    //用户退出
    @RequestMapping("userlogin.do")
    @ResponseBody
    public JsonVo loginout(HttpSession session){
        session.removeAttribute("user");
        return JsonVo.R(1,"退出成功",null);
    }
}
