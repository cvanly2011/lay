package com.lay.springboot.application;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * Created by Lay on 2016/3/22.
 */
@SpringBootApplication
@Log4j
public class Application implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {

        log.info("start insert into user table ");
        jdbcTemplate.update("INSERT INTO user(name, age) VALUES (?,?)", new Object[]{"Tom",12});


    }
}
