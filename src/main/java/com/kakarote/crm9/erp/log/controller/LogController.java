package com.kakarote.crm9.erp.log.controller;


import com.kakarote.crm9.erp.log.model.Log;
import com.kakarote.crm9.erp.log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class LogController {
    @Autowired
    private LogService service;

    @RequestMapping("log/main")
    public String show(){

        System.out.println("sss");
        return "main";
    }


    //查看日志
    @RequestMapping("log/view")
    public ModelAndView view(ModelAndView mv) {
        List<Log> list = service.selectAll();
        mv.addObject("list", list);
        mv.setViewName("view");
        return mv;
    }

    //写日志
    @RequestMapping("log/save")
    public String save(Log log,HttpServletRequest request){
        String  time =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        HttpSession session = request.getSession();
        String sessionId = session.getId();
        log.setCreateid(sessionId);
        log.setData(time);
        service.save(log);
        return "redirect:view.do";
    }

    //收到的
    @RequestMapping("log/receive")
    public ModelAndView receive(ModelAndView mv,Log log,HttpServletRequest request) {
        List<Log> list = service.selectById();
        mv.addObject("list", list);
        mv.setViewName("receive");
        return mv;
    }

}
