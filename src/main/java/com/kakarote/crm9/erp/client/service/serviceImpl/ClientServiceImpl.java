package com.kakarote.crm9.erp.client.service.serviceImpl;

import com.kakarote.crm9.erp.client.dao.ClientDao;
import com.kakarote.crm9.erp.client.model.Client;
import com.kakarote.crm9.erp.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDao clientDao;

    @Override
    public void add(Client client) {
        //把client数据添加到client表中
       clientDao.add(client);
       //返回刚才新添加的id，通过id添加联系人到中间表中

    }
}
