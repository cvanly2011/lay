package com.lay.study.springboot.es.repository;

import com.lay.study.springboot.es.bean.AccountInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Create by yalei.chen on 2017/6/16
 */
public interface ElasticAccountInfoRepository extends ElasticsearchRepository<AccountInfo,String> {

    AccountInfo findByAccountName(String accountName);
}
