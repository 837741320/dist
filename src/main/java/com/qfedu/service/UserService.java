package com.qfedu.service;

import com.qfedu.common.vo.JsonVo;
import com.qfedu.pojo.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;

public interface UserService {

    JsonVo<User> save(User user);

    JsonVo<User> loginUser(String phone, String password, HttpSession session);

    JsonVo updateuser(User user);

    JsonVo checkUser(String phone);
}
