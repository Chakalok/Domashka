package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Profile("test")
public class BeanTest {
    Logger logger = LoggerFactory.getLogger(BeanTest.class);

    @PostConstruct
    public void init() {
        logger.warn(this.getClass().getName() + "Я родился");
    }
}
