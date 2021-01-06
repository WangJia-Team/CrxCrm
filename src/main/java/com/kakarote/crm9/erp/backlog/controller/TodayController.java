package com.kakarote.crm9.erp.backlog.controller;

import com.kakarote.crm9.erp.backlog.model.Client;
import com.kakarote.crm9.erp.backlog.service.TodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TodayController {
    @Autowired
    private TodayService service;
    @RequestMapping("quchaofan.do")
    public ModelAndView view(ModelAndView modelAndView){
        List<Client> list = service.selectClientList();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("/quchaofan/quchaofan");
        return modelAndView;
    }
}
