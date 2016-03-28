package com.lay.springboot.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by Lay on 2016/3/22.
 */
@Data
public class User {

    private long id;
    private String name;
    private int age;
    private Date createTime;
}
