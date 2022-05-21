package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@EnableConfigurationProperties(ProfileProperties.class)
public class NameAndList {
    Logger logger = LoggerFactory.getLogger(NameAndList.class);

    private final ProfileProperties profileProperties;

    public NameAndList(ProfileProperties profileProperties) {
        this.profileProperties = profileProperties;
    }

    @PostConstruct
    public void init() {
        logger.warn("Prop name: " + profileProperties.getPropName());
        logger.warn("Lists " + profileProperties.getList());
    }
}
