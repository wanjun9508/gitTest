package com.springboot.testgit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
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