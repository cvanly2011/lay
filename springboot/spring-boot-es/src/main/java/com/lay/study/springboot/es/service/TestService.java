package com.lay.study.springboot.es.service;

import com.lay.study.springboot.es.bean.Entity;

import java.util.List;

/**
 * @author yalei.chen
 * @date 2018/1/10
 * @since JDK 1.8
 */
public interface TestService {

    void saveEntity(Entity entity);

    void saveEntity(List<Entity> entityList);

    List<Entity> searchEntity(String searchContent);
}
