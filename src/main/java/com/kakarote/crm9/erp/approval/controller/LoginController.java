package com.kakarote.crm9.erp.approval.controller;

import com.kakarote.crm9.erp.approval.model.LoginUser;
import com.kakarote.crm9.erp.approval.service.UserService;
import com.kakarote.crm9.erp.approval.tools.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private UserService service;

    /**
     * 初始化
     * @return 登陆界面
     */
    @RequestMapping("indexLogin")
    public String show(){
        return "login/login_user";
    }

    @RequestMapping("login")
    @ResponseBody
    public Message login(LoginUser user  , HttpServletRequest request){
        Message message = new Message();
        return service.login(user , request , message);
    }
}
