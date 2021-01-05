package com.example.microservice2;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello2")
    public String hello(){
        return "microservice2";
    }
}
