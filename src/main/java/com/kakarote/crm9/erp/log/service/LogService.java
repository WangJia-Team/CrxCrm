package com.kakarote.crm9.erp.log.service;


import com.kakarote.crm9.erp.log.model.Log;

import java.util.List;

public interface LogService {



    List<Log> selectAll();

    void save(Log log);

    List<Log> selectById();
}
