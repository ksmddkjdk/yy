package com.example.spingboot_web.contral;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/Hello")
    public String Hello(){
        System.out.println("hello world");

        return "hello world";
    }
}
