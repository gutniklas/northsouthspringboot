package com.a1.vueback.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController

public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
