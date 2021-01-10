package com.kakarote.crm9.erp.chanpin.controller;


import com.kakarote.crm9.erp.chanpin.model.Message;
import com.kakarote.crm9.erp.chanpin.model.Product;
import com.kakarote.crm9.erp.chanpin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;


    //查看产品
    @RequestMapping("product/pro")
    public ModelAndView view(ModelAndView mv) {
        List<Product> list = service.selectAll();
        mv.addObject("list1", list);
        mv.setViewName("/product/pro");
        return mv;

    }
}