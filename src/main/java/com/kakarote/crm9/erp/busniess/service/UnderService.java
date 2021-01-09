package com.kakarote.crm9.erp.busniess.service;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.busniess.model.Business;

import javax.servlet.http.HttpServletRequest;

public interface UnderService {


    String UnderView(Business business,HttpServletRequest request);
    Message  save(Business  business,HttpServletRequest request);

}
