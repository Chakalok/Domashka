package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/first")
    public String firstApi() {
        log.info("API#1");
        return "First";
    }

    @PostMapping("/second")
    public String secondApi() {
        log.info("API#2");
        return "Second";
    }
}
