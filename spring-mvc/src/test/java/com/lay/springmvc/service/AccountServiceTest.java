package com.newleaders.ac.service;

import com.newleaders.ac.model.pojo.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by Lay on 2016/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/ApplicationContext.xml"})
public class AccountServiceTest {

    Logger log = LoggerFactory.getLogger(AccountServiceTest.class);


    @Autowired
    private AccountService accountService;

    @Test
    public void testSelectByUsername(){

        try {
            Account account = accountService.selectByUsername("Newleaders");
            Assert.assertNotEquals(account,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}