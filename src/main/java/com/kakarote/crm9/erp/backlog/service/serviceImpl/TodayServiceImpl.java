package com.kakarote.crm9.erp.backlog.service.serviceImpl;

import com.kakarote.crm9.erp.backlog.dao.ClientMapper;
import com.kakarote.crm9.erp.backlog.model.Client;
import com.kakarote.crm9.erp.backlog.model.ClientExample;
import com.kakarote.crm9.erp.backlog.service.TodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodayServiceImpl implements TodayService {
    @Autowired
    private ClientMapper mapper;


    @Override
    public List<Client> selectClientList() {
        return mapper.selectByExample(new ClientExample());
    }
}
