package com.kakarote.crm9.erp.admin.service.serviceImpl;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.admin.dao.WjAdminUserMapper;
import com.kakarote.crm9.erp.admin.model.WjAdminUser;
import com.kakarote.crm9.erp.admin.model.WjAdminUserExample;
import com.kakarote.crm9.erp.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private WjAdminUserMapper mapper;

    /**
     * 用户登录：用户名 密码
     *
     * @param user
     * @param request
     * @return
     */
    @Override
    public Message login(WjAdminUser user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        WjAdminUser adminUser = mapper.selectByLoginUser(user);
        Message mess = new Message();
        if (adminUser != null) {
            session.setAttribute("user", adminUser);
            adminUser.setLastLoginIp(request.getRemoteAddr());//待解决 真实ip地址 用java工具类
            adminUser.setLastLoginTime(new Date());
            mapper.updateByPrimaryKeySelective(adminUser);
            mess.setMess("success");
        } else {
            mess.setMess("fail");
        }
        return mess;
    }

    /**
     * 用户退出：会话失效
     * @param request
     * @return
     */
    @Override
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.invalidate();
        return "login/login_user";
    }

    /**
     * 新增员工
     * @param user
     * @param request
     * @return
     */
    @Override
    public Message addUser(WjAdminUser user, HttpServletRequest request) {
        mapper.insertSelective(user);
        Message mess = new Message();
        mess.setMess("success");
        return mess;
    }

    /**
     * 查看所有员工
     * @return
     */
    @Override
    public String userView(HttpServletRequest request) {
        List<WjAdminUser> list = mapper.selectByExample(new WjAdminUserExample());
        request.setAttribute("userView",list);
        return "forward:view/admin/view.jsp";
    }
}
