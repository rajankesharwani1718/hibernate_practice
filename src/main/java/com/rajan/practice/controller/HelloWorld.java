package com.rajan.practice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @PostMapping("/helo")
    public void hello(){

    }
}
