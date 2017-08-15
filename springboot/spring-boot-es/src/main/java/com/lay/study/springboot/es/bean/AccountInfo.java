package com.lay.study.springboot.es.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * Create by yalei.chen on 2017/6/16
 */
@Document(indexName = "cwenao",type = "accountinfo", shards = 1,replicas = 0, refreshInterval = "-1")
public class AccountInfo {

    @Id
    private String id;
    @Field
    private String accountName;
    @Field
    private String nickName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
