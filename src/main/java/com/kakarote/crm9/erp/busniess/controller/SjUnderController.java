package com.kakarote.crm9.erp.busniess.controller;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.busniess.model.Business;
import com.kakarote.crm9.erp.busniess.service.UnderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SjUnderController {

    @Autowired
    private UnderService service;


    @RequestMapping("sjview.do")
    public String view(Business business, HttpServletRequest request, Model  model) {
       List<Business> list =  service.view(business,request);
       model.addAttribute("list",list);
        return "shangji/sjview";
    }


    @RequestMapping("save.do")
    @ResponseBody
    public Message save(HttpServletRequest request,Business  business){

        return service.save(business,request);
    }

}
