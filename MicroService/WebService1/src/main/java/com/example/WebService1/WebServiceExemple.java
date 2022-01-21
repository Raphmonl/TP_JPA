package com.example.WebService1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceExemple {
    @GetMapping("/")
    public String sayHello(){
        return "Hello !";
    }
}