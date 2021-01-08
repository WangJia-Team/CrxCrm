package com.kakarote.crm9.erp.busniess.controller;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.busniess.model.Business;
import com.kakarote.crm9.erp.busniess.service.UnderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SjUnderController {

    @Autowired
    private UnderService service;


    @RequestMapping("UnderView")
    @ResponseBody
    public String UnderView(Business business, HttpServletRequest request) {

        return service.UnderView(business,request);
    }


    @RequestMapping("save")
    @ResponseBody
    public Message save(HttpServletRequest request,Business  business){

        return service.save(business,request);
    }

}
