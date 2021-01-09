package com.kakarote.crm9.erp.busniess.service;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.busniess.model.Business;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UnderService {



    Message  save(Business  business,HttpServletRequest request);



    List<Business> view(Business business, HttpServletRequest request);
}
