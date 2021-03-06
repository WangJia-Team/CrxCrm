package com.kakarote.crm9.erp.admin.service;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.admin.model.WjAdminUser;

import javax.servlet.http.HttpServletRequest;

/**
 * 员工接口
 */
public interface AdminUserService {

    Message login(WjAdminUser user, HttpServletRequest request);
    String logout(HttpServletRequest request);

    Message addUser(WjAdminUser user, HttpServletRequest request);
    String userView(HttpServletRequest request);
    
}
