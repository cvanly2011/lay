package com.lay.study.springboot.swagger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

/**
 * @Author yalei.chen
 * @Date 2017/8/15
 * @Since JDK 1.8
 */
@ApiModel
public class User {

    @ApiModelProperty(value = "用户id",required = true)
    private Long id;
    @ApiModelProperty(value = "用户姓名")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
