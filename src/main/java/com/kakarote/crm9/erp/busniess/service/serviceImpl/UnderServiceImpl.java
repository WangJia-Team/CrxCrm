package com.kakarote.crm9.erp.busniess.service.serviceImpl;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.admin.model.WjAdminUser;
import com.kakarote.crm9.erp.admin.model.WjAdminUserExample;
import com.kakarote.crm9.erp.busniess.dao.BusinessMapper;
import com.kakarote.crm9.erp.busniess.model.Business;
import com.kakarote.crm9.erp.busniess.model.BusinessExample;
import com.kakarote.crm9.erp.busniess.service.UnderService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.generator.api.MyBatisGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UnderServiceImpl implements UnderService {
    @Autowired
    private BusinessMapper mapper;

    /**
     * 新增员工
     * @param business
     * @param request
     * @return
     */


    /**
     * 查看所有商机
     * @return
     */


    @Override
    public List<Business> view(Business business, HttpServletRequest request) {
        return  mapper.selectByExample(new BusinessExample());

    }


    /**
     *
     * @param business
     * @param request
     * @return
     */
    @Override
    public Message save(Business business,HttpServletRequest request) {
        mapper.insert(business);
        Message  message  =  new Message();
        message.setMess("success");
        return message;
    }
}
