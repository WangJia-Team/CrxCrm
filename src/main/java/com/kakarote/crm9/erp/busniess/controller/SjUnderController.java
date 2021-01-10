package com.kakarote.crm9.erp.busniess.controller;

import com.kakarote.crm9.erp.busniess.dao.Message;
import com.kakarote.crm9.erp.busniess.model.Business;
import com.kakarote.crm9.erp.busniess.service.UnderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
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


//    @RequestMapping("save")
//    @ResponseBody
//    public Message save(Business  business){
//
//        return service.save(business);
//    }

    @RequestMapping("save")
    public String save(Business business,HttpServletRequest request) {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        business.setDealDate(time);
        business.setNextTime(time);
        business.setCreateTime(time);
        business.setUpdateTime(time);
        service.save(business,request);
        return "shangji/save";
    }
}
