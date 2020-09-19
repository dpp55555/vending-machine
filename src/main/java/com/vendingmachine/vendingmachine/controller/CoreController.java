package com.vendingmachine.vendingmachine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello+");
        return "hello";
    }
}

