package com.springboot.testgit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("测试分支跟踪，主干修改了代码");
        System.out.println("测试分支跟踪，主干修改了代码");
        System.out.println("测试分支跟踪，主干修改了代码2020");
        System.out.println("dev01 提交的新代码，修改了");
        System.out.println("dev提交的新代码");
        System.out.println("测试新建分支");
        return "Hello World2";
    }

    @RequestMapping("/test")
    public String test(@RequestParam String test) {
        return "Hello World" +test;
    }

    @RequestMapping("/test2")
    public String test2() {
        return "test2";
    }
    @RequestMapping("/test3")
    public String test3() {
        return "test3";
    }
}