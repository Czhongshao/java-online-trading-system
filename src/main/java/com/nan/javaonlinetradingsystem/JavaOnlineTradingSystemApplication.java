package com.nan.javaonlinetradingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
@MapperScan("com.nan.javaonlinetradingsystem.mapper")
public class JavaOnlineTradingSystemApplication {
    public static void main(String[] args) {
        // 设置默认时区为中国时区
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(JavaOnlineTradingSystemApplication.class, args);
    }
}
