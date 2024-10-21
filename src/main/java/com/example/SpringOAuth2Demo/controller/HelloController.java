package com.example.SpringOAuth2Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloSecurity")
    public String sayHello(){
        return "HELLO";
    }
}
