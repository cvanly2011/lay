package com.lay.study.springboot.es.service;

import com.lay.study.springboot.es.bean.AccountInfo;

/**
 * Create by yalei.chen on 2017/6/16
 */
public interface ESAccountInfoService {

    void init ();

    void createIndex ();

    AccountInfo queryAccountInfoById(String id);

    AccountInfo queryAccountInfoByName(String accountName);
}
