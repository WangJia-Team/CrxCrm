package com.kakarote.crm9.erp.approval.service;

import com.kakarote.crm9.erp.approval.model.Task;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TaskService {

    List<Task> queryAll(HttpServletRequest request);
}
