package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@ConditionalOnBean(BeanTest.class)
public class SecondBean {
    Logger logger = LoggerFactory.getLogger(SecondBean.class);

    @PostConstruct
    public void init() {
        logger.warn(this.getClass().getName() + "Я родился");
    }
}
