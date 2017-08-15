package com.lay.study.springboot.es.service.impl;

import com.lay.study.springboot.es.bean.AccountInfo;
import com.lay.study.springboot.es.repository.ElasticAccountInfoRepository;
import com.lay.study.springboot.es.service.ESAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by yalei.chen on 2017/6/16
 */
@Service("esAccountInfoServiceImpl")
public class ESAccountInfoServiceImpl implements ESAccountInfoService {

    @Autowired
    private ElasticAccountInfoRepository elasticAccountInfoRepository;


    @Override
    public void init() {
        for (int i = 0; i < 100; i++) {
            AccountInfo news = new AccountInfo();
            news.setId(i+"");
            news.setAccountName(i + ".陈亚磊单元测试用例");
            news.setNickName("陈亚磊单元测试用例"+i+"xxxxx");
            this.elasticAccountInfoRepository.save(news);
        }
    }

    @Override
    public AccountInfo queryAccountInfoById(String id) {
        return elasticAccountInfoRepository.findOne(id);
    }

    @Override
    public AccountInfo queryAccountInfoByName(String accountName) {
        return elasticAccountInfoRepository.findByAccountName(accountName);
    }
}
