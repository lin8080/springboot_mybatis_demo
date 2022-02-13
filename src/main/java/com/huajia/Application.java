package com.huajia;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.huajia.mapper") //扫描的mapper
@EnableScheduling //开启定时任务
@EnableTransactionManagement //开启事务
@SpringBootApplication
public class Application  {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
