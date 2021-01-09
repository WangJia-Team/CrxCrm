package com.kakarote.crm9.erp.bi.controller;

import com.kakarote.crm9.erp.bi.model.BiUserCustomer;
import com.kakarote.crm9.erp.bi.service.biService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class biController {
    @Autowired
    private biService service;
    @RequestMapping("index")
    public String show() {
        return "biView/customer";
    }

    @RequestMapping("customer")
    @ResponseBody
    public String view(HttpServletRequest request) {
        List<BiUserCustomer> list = service.selectBiUserCustomerList();
        request.setAttribute("list", list);

        return "/customer";
    }
}
