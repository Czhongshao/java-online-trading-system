package com.nan.javaonlinetradingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.nan.javaonlinetradingsystem")
@SpringBootApplication
public class JavaOnlineTradingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaOnlineTradingSystemApplication.class, args);
    }

}
