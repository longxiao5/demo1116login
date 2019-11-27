package com.example.lxtest01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.lxtest01.mapper")
public class LxTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(LxTest01Application.class, args);
    }

}