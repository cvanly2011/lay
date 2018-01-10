package com.lay.study.springboot.es.bean;

import java.io.Serializable;

/**
 * @author yalei.chen
 * @date 2018/1/10
 * @since JDK 1.8
 */
public class Entity implements Serializable {

    private static final long serialVersionUID = -763638353551774166L;

    public static final String INDEX_NAME = "index_entity";

    public static final String TYPE = "tstype";

    private Long id;

    private String name;

    public Entity() {
        super();
    }

    public Entity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
