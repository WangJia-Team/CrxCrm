package com.kakarote.crm9.erp.chanpin.service.serviceImpl;


import com.kakarote.crm9.erp.chanpin.dao.ProductMapper;
import com.kakarote.crm9.erp.chanpin.model.Message;
import com.kakarote.crm9.erp.chanpin.model.Product;
import com.kakarote.crm9.erp.chanpin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper mapper;


    @Override
    public List<Product> selectAll(){
        return mapper.selectAll();
    }

}
