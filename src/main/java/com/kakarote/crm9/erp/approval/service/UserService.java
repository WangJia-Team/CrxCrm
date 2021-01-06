package com.kakarote.crm9.erp.approval.service;

import com.kakarote.crm9.erp.approval.model.LoginUser;
import com.kakarote.crm9.erp.approval.tools.Message;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    Message login(LoginUser user, HttpServletRequest request, Message message);
}
