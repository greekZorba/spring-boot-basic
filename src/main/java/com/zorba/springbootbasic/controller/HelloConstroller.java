package com.zorba.springbootbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConstroller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Spring boot basic!!";
    }
}
