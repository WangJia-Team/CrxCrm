package com.kakarote.crm9.erp.sunye.controller;

import com.kakarote.crm9.erp.approval.model.User;
import com.kakarote.crm9.erp.sunye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    @Qualifier("UserService")   //这里使用@ualifier注解注入bookService业务层
    private UserService userService;

    @RequestMapping("yibiaopan/1")  //处理main请求
    public ModelAndView view(ModelAndView mv){

        List<User> list = userService.getAll(); //调用业务层方法

       mv.addObject("list",list);
       mv.setViewName("1");

        return mv;
    }
}
