package com.ecommerce.springboot_ecom.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {


    @GetMapping("/api/hello")
    public  String sayHello(){
        return  "Helllooooo";
    }
}
