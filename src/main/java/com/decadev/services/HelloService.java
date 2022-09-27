package com.decadev.services;

import com.decadev.entities.Hello;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greet() {
        return "Hello from Spring Boot Hello Service";
    }

    public Hello greeting() {
        return new Hello(0, "Hello from the greeting method The api is working and builds correctly!");
    }
}
