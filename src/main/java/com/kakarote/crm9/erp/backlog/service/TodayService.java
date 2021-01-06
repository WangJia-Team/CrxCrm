package com.kakarote.crm9.erp.backlog.service;

import com.kakarote.crm9.erp.backlog.model.Client;

import java.util.List;

public interface TodayService {

    List<Client> selectClientList();
}
