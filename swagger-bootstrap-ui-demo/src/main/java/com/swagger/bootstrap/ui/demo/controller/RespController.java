/*
 * Copyright (C) 2017 Zhejiang BYCDAO Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.bycdao.com.
 * Developer Web Site: http://open.bycdao.com.
 */

package com.swagger.bootstrap.ui.demo.controller;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.swagger.bootstrap.ui.demo.domain.Menu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/***
 *
 * @since:swagger-bootstrap-ui-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2017/09/04 15:49
 */
@Api(value = "测试ResponseEntity",tags = "测试ResponseEntity")
@RequestMapping("/api/resp")
@RestController
public class RespController {

    @PostMapping("/test")
    @ApiOperation(value = "string类型",notes = "针对ResponseEntity<String>")
    public ResponseEntity<String> test(){
        Map<String,Object> map= Maps.newHashMap();
        map.put("message","保存成功");
        map.put("success",true);
        String json=new Gson().toJson(map);
        return new ResponseEntity<String>(json,new HttpHeaders(), HttpStatus.OK);

    }
    @PostMapping("/test1")
    @ApiOperation(value = "实体类",notes = "针对ResponseEntity<T>类型")
    public ResponseEntity<Menu> test1(){
        Menu menu=new Menu("m1","首页");
        return new ResponseEntity<Menu>(menu,new HttpHeaders(), HttpStatus.OK);

    }

}
