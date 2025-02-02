package com.example.testscodespaces.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitchController {

    @GetMapping("/bitch")
    public String getBitch(){
        return "Hey Bitch";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi";
    }
}
