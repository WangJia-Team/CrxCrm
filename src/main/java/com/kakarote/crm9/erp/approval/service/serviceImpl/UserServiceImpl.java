package com.kakarote.crm9.erp.approval.service.serviceImpl;

import com.kakarote.crm9.erp.approval.dao.LoginUserMapper;
import com.kakarote.crm9.erp.approval.model.LoginUser;
import com.kakarote.crm9.erp.approval.service.UserService;
import com.kakarote.crm9.erp.approval.tools.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private LoginUserMapper mapper;

    @Override
    public Message login(LoginUser user, HttpServletRequest request, Message message) {
        HttpSession session = request.getSession();
        LoginUser newUser = mapper.selectByUser(user);

        if(newUser != null){
            session.setAttribute("user" , newUser);
            message.setMess("success");
        }else {
            message.setMess("fail");
        }
        return message;
    }
}
