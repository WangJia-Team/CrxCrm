package com.kakarote.crm9.erp.approval.service.serviceImpl;

import com.kakarote.crm9.erp.admin.model.WjAdminUser;
import com.kakarote.crm9.erp.approval.dao.SqTaskMapper;
import com.kakarote.crm9.erp.approval.model.Task;
import com.kakarote.crm9.erp.approval.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private SqTaskMapper mapper;

    @Override
    public List<Task> queryAll(HttpServletRequest request) {
        HttpSession session = request.getSession();
        WjAdminUser user = (WjAdminUser) session.getAttribute("user");
        List<Task> list = mapper.queryAll(user.getUserId());
        return list;
    }
}
