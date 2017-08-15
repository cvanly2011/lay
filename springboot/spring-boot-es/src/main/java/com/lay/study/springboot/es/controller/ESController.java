package com.lay.study.springboot.es.controller;

import com.lay.study.springboot.es.bean.AccountInfo;
import com.lay.study.springboot.es.service.ESAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Create by yalei.chen on 2017/6/16
 */
@RestController
public class ESController {

    @Autowired
    private ESAccountInfoService esAccountInfoServiceImpl;

    /**
     * 初始化
     * @param request
     */
    @RequestMapping(value = "/init")
    public void init(HttpServletRequest request) {
        this.esAccountInfoServiceImpl.init();
    }

    @RequestMapping("/esAccountInfo")
    public AccountInfo queryAccountInfo(String id, ModelMap modelMap){

        AccountInfo accountInfo = esAccountInfoServiceImpl.queryAccountInfoById(id);

        return accountInfo;
    }

    @RequestMapping("/esAccountInfoName")
    public AccountInfo queryAccountInfoByAccountName(String accountName, ModelMap modelMap){

        AccountInfo accountInfo = esAccountInfoServiceImpl.queryAccountInfoByName(accountName);

        return accountInfo;
    }
}
