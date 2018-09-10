package com.qfedu.service.impl;
import com.qfedu.common.utils.RedisUtil;
import com.qfedu.common.vo.JsonVo;
import com.qfedu.mapper.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;
    @Override
    public JsonVo<User> save(User user) {
        Object uuid = redisUtil.get("uuid");
        if (Objects.equals(uuid, user.getUserCode())) {
            int i = userMapper.insert(user);
            if (i > 0) {

                return JsonVo.R(1,"注册成功",null);
            } else {

                return JsonVo.R(0,"注册失败",null);
            }
        }

        return JsonVo.R(2,"验证码不正确",null);
    }

    @Override
    public JsonVo<User> loginUser(String phone, String password, HttpSession session) {
        User user = userMapper.selectA(phone);
        if (user!=null){
        if (Objects.equals(user.getPassowrd(),password)){

            List<Object> obj = new ArrayList<>();
            obj.add(user);
            session.setAttribute("user",user);
            return JsonVo.R(1,"登陆成功",obj);
        }

            return JsonVo.R(0,"用户密码不正确",null);
        }

        return JsonVo.R(3,"用户不存在",null);
    }

    @Override
    public JsonVo updateuser(User user) {
        int i = userMapper.updateByPrimaryKey(user);
        if (i>0){

            return JsonVo.R(1,"修改成功",null);
        }

        return JsonVo.R(0,"修改失败",null);
    }

    @Override
    public JsonVo checkUser(String phone) {
        User user = userMapper.selectA(phone);
        if (user!=null){
            return JsonVo.R(0,"手机号已存在",null);
        }
        return JsonVo.R(1,"手机号可用",null);
    }
}
