package com.lay.study.springboot.es.service.impl;

import com.lay.study.springboot.es.bean.AccountInfo;
import com.lay.study.springboot.es.repository.ElasticAccountInfoRepository;
import com.lay.study.springboot.es.service.ESAccountInfoService;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateRequestBuilder;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Create by yalei.chen on 2017/6/16
 */
@Service("esAccountInfoServiceImpl")
public class ESAccountInfoServiceImpl implements ESAccountInfoService {

    @Autowired
    private ElasticAccountInfoRepository elasticAccountInfoRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    private static Integer ID = 100;

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

    @Override
    public void add() {

        AccountInfo news = new AccountInfo();
        news.setId(ID+"");
        news.setAccountName(ID + ".陈亚磊单元测试用例");
        news.setNickName("陈亚磊单元测试用例"+ID+"xxxxx");
        news.setAge(ID);
        news.setCreateTime(new Date());
        news.setIncome(new BigDecimal(ID+1000));
        this.elasticAccountInfoRepository.save(news);

    }

    @Override
    public Page<AccountInfo> queryPage(int pageNo, int pageSize, String sortField) {


        BoolQueryBuilder query = QueryBuilders.boolQuery().filter(QueryBuilders.boolQuery()
                .must(QueryBuilders.rangeQuery("age").lte(10))
                .must(QueryBuilders.rangeQuery("age").gt(20)));

//        elasticAccountInfoRepository.search(query);

        SortBuilder sort = SortBuilders.fieldSort("age").order(SortOrder.DESC);

        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(query)
                .withPageable(new PageRequest(1, 10))
                .withSort(sort)
                .build();


//        Page<AccountInfo> search = elasticAccountInfoRepository.search(searchQuery);

        AggregatedPage<AccountInfo> accountInfos = elasticsearchTemplate.queryForPage(searchQuery, AccountInfo.class);
        return accountInfos;
    }

    @Override
    public List<AccountInfo> queryList() {

        BoolQueryBuilder query = QueryBuilders.boolQuery().filter(QueryBuilders.boolQuery()
                .must(QueryBuilders.rangeQuery("age").lte(20))
                .must(QueryBuilders.rangeQuery("age").gt(10)));


        NativeSearchQuery build = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.termQuery("fid", 4L)).build();

//        NativeSearchQuery build = new NativeSearchQueryBuilder()
//                .withQuery(query).build();
        List<AccountInfo> accountInfos = elasticsearchTemplate.queryForList(build, AccountInfo.class);
        return accountInfos;
    }

    @Override
    public void update() {

//        UpdateRequest updateRequest = new UpdateRequest();
//
//        IndexRequest doc = new IndexRequest();
//        doc.source("nickName","张三6").version(2);
//        updateRequest.doc(doc).version(1);
//
//        UpdateQuery build = new UpdateQueryBuilder().withId("2").withIndexName("account").withType("accountinfo").withUpdateRequest(updateRequest).build();
//
//        UpdateResponse updateRes = elasticsearchTemplate.update(build);

        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setNickName("李四");
        IndexQuery indexQuery = new IndexQueryBuilder().withIndexName("account").withType("accountinfo").withId("2").withVersion(20L).withObject(accountInfo).build();
        String index = elasticsearchTemplate.index(indexQuery);

        System.out.println(index);

    }
}
