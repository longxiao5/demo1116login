package com.example.lxtest01.serviceImpl;

import com.example.lxtest01.bean.UserBean;
import com.example.lxtest01.mapper.UserMapper;
import com.example.lxtest01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}