package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/login")
    public List<Demo> likeName(String user){
        System.out.println(user);
        return demoService.likeName(user);
    }

    @RequestMapping("/hello")
    public String simplePattern(){
        return "someResult";

    }

}