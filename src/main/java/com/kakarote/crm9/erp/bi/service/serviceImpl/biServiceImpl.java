package com.kakarote.crm9.erp.bi.service.serviceImpl;

import com.kakarote.crm9.erp.bi.dao.BiUserCustomerMapper;
import com.kakarote.crm9.erp.bi.model.BiUserCustomer;
import com.kakarote.crm9.erp.bi.model.BiUserCustomerExample;
import com.kakarote.crm9.erp.bi.service.biService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class biServiceImpl implements biService {
    @Autowired
    private BiUserCustomerMapper mapper;

    /**
     * 查看所有
     * @return
     */
    @Override
    public List<BiUserCustomer> selectBiUserCustomerList() {
        return mapper.selectByExample(new BiUserCustomerExample());
    }


}
