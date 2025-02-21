package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    // UC1: Basic GET Request
    @GetMapping
    public String sayHello() {
        logger.info("GET /hello called");
        return "Hello From BridgeLabz!!!";
    }

    // UC2: GET Request with Query Parameter
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value = "name") String name) {
        logger.info("GET /hello/query called with name: {}", name);
        return "Hello " + name + " from BridgeLabz!";
    }
}
