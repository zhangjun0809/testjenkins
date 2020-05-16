package com.atguigu.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zhangjun
 * @create 2020-05-16 18:24
 */
@Controller
public class TestJenkins {

    @RequestMapping("hello")
    @ResponseBody
    public String hell() {
        System.out.println(".................");
        return "hhhhhhhhhhhhh";
    }
}
