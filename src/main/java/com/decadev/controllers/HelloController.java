package com.decadev.controllers;


import com.decadev.entities.Hello;
import com.decadev.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping
    Hello greeting() {
        return helloService.greeting();
    }
}
