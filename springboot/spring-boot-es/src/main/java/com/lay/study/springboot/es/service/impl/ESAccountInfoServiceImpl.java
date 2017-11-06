package com.lay.study.springboot.es.service.impl;

import com.lay.study.springboot.es.bean.AccountInfo;
import com.lay.study.springboot.es.repository.ElasticAccountInfoRepository;
import com.lay.study.springboot.es.service.ESAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Create by yalei.chen on 2017/6/16
 */
@Service("esAccountInfoServiceImpl")
public class ESAccountInfoServiceImpl implements ESAccountInfoService {

    @Autowired
    private ElasticAccountInfoRepository elasticAccountInfoRepository;

//    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void init() {
        for (int i = 0; i < 100; i++) {
            AccountInfo news = new AccountInfo();
            news.setId(i+"");
            news.setAccountName(i + ".陈亚磊单元测试用例");
            news.setNickName("陈亚磊单元测试用例"+i+"xxxxx");
            news.setAge(i);
            news.setCreateTime(new Date());
            news.setIncome(new BigDecimal(i+1000));
            this.elasticAccountInfoRepository.save(news);
        }
    }

    @Override
    public void createIndex() {
//        elasticsearchTemplate.createIndex("account");
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
