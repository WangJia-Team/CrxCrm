package com.kakarote.crm9.erp.chanpin.service;


import com.kakarote.crm9.erp.chanpin.model.Message;
import com.kakarote.crm9.erp.chanpin.model.Product;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ProductService {




    List<Product> selectAll();
}
