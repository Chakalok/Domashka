package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@ConditionalOnExpression("'${prop.environment}' != 'default'")
public class ThirdBean {
    Logger logger = LoggerFactory.getLogger(ThirdBean.class);

    @PostConstruct
    public void init() {
        logger.warn(this.getClass().getName() + "Я родился");
    }
}
