package com.example.springboot_5_mybatis.service;

import com.example.springboot_5_mybatis.bean.Account;
import com.example.springboot_5_mybatis.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {


    @Autowired
    private AccountMapper accountMapper;

    public int add(String name,double money){
        return accountMapper.add(name, money);
    }

    public int update(String name,double money ,int id){
        return accountMapper.update(name,money,id );
    }

    public int delete(int id){
        return accountMapper.delete(id);
    }

    public List<Account> findAccontList(){
        return accountMapper.findAccountList();
    }


    public Account findAccount(int id){
        return accountMapper.findAccount(id);
    }
}
