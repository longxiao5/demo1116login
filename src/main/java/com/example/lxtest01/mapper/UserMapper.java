package com.example.lxtest01.mapper;

import com.example.lxtest01.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name,String password);

}