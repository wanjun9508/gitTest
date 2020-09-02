package com.springboot.testgit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        System.out.println("dev01代码提交");
        System.out.println("本地dev01代码提交dev");
        System.out.println("本地dev012代码提交dev2");
        System.out.println("本地m分支提交到dev");
        System.out.println("测试撤销合并");
        System.out.println("测试合并commit message");
        return "Hello World";
    }

    @RequestMapping("/test")
    public String test(@RequestParam String test) {
        return "Hello World" +test;
    }

}