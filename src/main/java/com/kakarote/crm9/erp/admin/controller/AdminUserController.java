package com.kakarote.crm9.erp.admin.controller;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.admin.model.WjAdminUser;
import com.kakarote.crm9.erp.admin.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("admin/")
public class AdminUserController {

    @Autowired
    private AdminUserService service;

    @RequestMapping("addUser")
    @ResponseBody
    public Message addUser(WjAdminUser user, HttpServletRequest request) {
        return service.addUser(user, request);
    }

    @RequestMapping("userView")
    public String userView(HttpServletRequest request) {
        return service.userView(request);
    }


}
