package com.kakarote.crm9.erp.admin.service.serviceImpl;

import com.kakarote.crm9.erp.admin.dao.Message;
import com.kakarote.crm9.erp.admin.dao.WjAdminDeptMapper;
import com.kakarote.crm9.erp.admin.dao.WjAdminUserMapper;
import com.kakarote.crm9.erp.admin.model.WjAdminDept;
import com.kakarote.crm9.erp.admin.model.WjAdminDeptExample;
import com.kakarote.crm9.erp.admin.model.WjAdminUser;
import com.kakarote.crm9.erp.admin.model.WjAdminUserExample;
import com.kakarote.crm9.erp.admin.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * 员工ServiceImpl
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private WjAdminUserMapper mapper;

    @Autowired
    private WjAdminDeptMapper deptMapper;

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
     *
     * @param request
     * @return
     */
    @Override
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");//用户
        session.invalidate();
        return "login/login_user";
    }

    /**
     * 新增员工
     *
     * @param user
     * @param request
     * @return
     */
    @Override
    public Message addUser(WjAdminUser user, HttpServletRequest request) {
        user.setCreateTime(new Date());
        mapper.insertSelective(user);
        Message mess = new Message();
        mess.setMess("success");
        return mess;
    }

    /**
     * 查看所有员工
     *
     * @return
     */
    @Override
    public String userView(HttpServletRequest request) {
        //查询所有员工
        List<WjAdminUser> list = mapper.selectByExample(new WjAdminUserExample());
        //查询所有部门
        List<WjAdminDept> depts = deptMapper.selectByExample(new WjAdminDeptExample());

//        List<WjAdminDept> depts = new ArrayList<WjAdminDept>();
//        WjAdminDeptExample example = new WjAdminDeptExample();
//        
//        
//        //遍历员工的deptId 部门id
//        for (WjAdminUser user : list) {
//            example.createCriteria().andDeptIdEqualTo(user.getDeptId());
//            depts = deptMapper.selectByExample(example);
//        }

        HttpSession session = request.getSession();
        session.setAttribute("userView", list);
        session.setAttribute("depts", depts);
        return "redirect:/view/admin/view.jsp";
    }
}
