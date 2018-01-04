package com.lay.study.springboot.es.service;

import com.lay.study.springboot.es.bean.AccountInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Create by yalei.chen on 2017/6/16
 */
public interface ESAccountInfoService {

    void init ();

    void createIndex ();

    AccountInfo queryAccountInfoById(String id);

    AccountInfo queryAccountInfoByName(String accountName);

    void add();

    Page<AccountInfo> queryPage(int pageNo, int pageSize, String sort);

    List<AccountInfo> queryList();

    void update();
}
