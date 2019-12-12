package com.pjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@SpringBootApplication 标注一个主程序类，说明这是一个spring boot应用
 */

@SpringBootApplication
public class HelloMainApp {

    public static void main(String[] args) {
        //spring-boot 应用启动
        SpringApplication.run(HelloMainApp.class,args);
    }
}
