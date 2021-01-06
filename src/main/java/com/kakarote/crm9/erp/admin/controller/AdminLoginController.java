package com.kakarote.crm9.erp.admin.controller;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.admin.model.WjAdminUser;
import com.kakarote.crm9.erp.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录
 */
@Controller
public class AdminLoginController {
    
    @Autowired
    private UserService service;
    
    @RequestMapping("index")
    public String show() {
        return "login/login_user";
    }
    
    @RequestMapping("login")
    @ResponseBody
    public Message login(WjAdminUser user, HttpServletRequest request) {
        return service.login(user, request);
    }

}
