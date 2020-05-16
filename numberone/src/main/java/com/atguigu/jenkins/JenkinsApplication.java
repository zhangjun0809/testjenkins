package com.atguigu.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Zhangjun
 * @create 2020-05-16 18:09
 */
@SpringBootApplication
@ComponentScan({"com.atguigu"})
public class JenkinsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class,args);
    }
}
