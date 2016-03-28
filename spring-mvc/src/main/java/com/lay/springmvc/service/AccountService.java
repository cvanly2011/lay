package com.newleaders.ac.service;

import com.newleaders.ac.model.mapper.AccountMapper;
import com.newleaders.ac.model.pojo.Account;
import com.newleaders.ac.model.pojo.AccountExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lay on 2016/3/28.
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Account selectByUsername(String userName) throws Exception{
        AccountExample example = new AccountExample();
        AccountExample.Criteria cri = example.createCriteria();
        cri.andUsernameEqualTo(userName);
        List<Account> accounts = accountMapper.selectByExample(example);
        if(null == accounts || accounts.size()==0){
            return null;
        }

        return accounts.get(0);
    }
}
