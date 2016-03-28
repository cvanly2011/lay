package com.newleaders.ac.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lay on 2016/3/28.
 */
@Controller
public class TestController {

    private Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/oscar_java/test")
    public String test(){

        log.info("--- test controller begin ----");
        return "test";
    }
}
