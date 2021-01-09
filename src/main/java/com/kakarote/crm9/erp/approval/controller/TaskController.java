package com.kakarote.crm9.erp.approval.controller;

import com.kakarote.crm9.erp.approval.model.Task;
import com.kakarote.crm9.erp.approval.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskService service;

    @RequestMapping("task/find")
    public String queryAll(HttpServletRequest request , HttpServletResponse response){
        List<Task> list = service.queryAll(request);
        HttpSession session = request.getSession();
        session.setAttribute("list" , list);
        return "redirect:view/main";
    }
}
