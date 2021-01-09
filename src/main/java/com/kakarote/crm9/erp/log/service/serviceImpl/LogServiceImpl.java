package com.kakarote.crm9.erp.log.service.serviceImpl;

import com.kakarote.crm9.erp.log.dao.LogMapper;
import com.kakarote.crm9.erp.log.model.Log;
import com.kakarote.crm9.erp.log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper mapper;


    @Override
    public List<Log> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public void save(Log log) {
        String  time =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        log.setData(time);
        mapper.insert(log);
    }

    @Override
    public List<Log> selectById() {
        return mapper.selectById();
    }

}
