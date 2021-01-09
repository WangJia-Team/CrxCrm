package com.kakarote.crm9.erp.sunye.service.serviceimpl;

import com.kakarote.crm9.erp.approval.model.User;
import com.kakarote.crm9.erp.sunye.dao.WjAdminUserMapper;
import com.kakarote.crm9.erp.sunye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;

@Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT)
//表示数据库隔离级别为如果当前有就使用当前，如果没有就创建新的事务，
//隔离级别为：读已提交，也就是数据在写入的时候是无法被读的，只有提交后才能让其他事务读取，防止数据库发生脏读
@Service("userservice")
public class UserServiceImpl implements UserService {
@Autowired
    private WjAdminUserMapper wjAdminUserMapper;
    @Transactional(readOnly=true)//只读
    @Override
    public List<User> getAll() {
        return null;
    }



}
