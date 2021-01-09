package com.kakarote.crm9.erp.client.controller;

import com.kakarote.crm9.erp.client.model.Client;
import com.kakarote.crm9.erp.client.model.Result;
import com.kakarote.crm9.erp.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;
   @RequestMapping("/add")
    public Result add(Client client){
       try {
           service.add(client);
       }catch (Exception e){
           e.printStackTrace();
           return new Result(false,"新增失败");//新增成功
       }
        return new Result(true,"新增成功");//新增成功
    }

}
