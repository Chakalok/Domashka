package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("lion")
public class Lion implements IAnimal{
    @PostConstruct
    public void postConstruct(){
        System.out.println("Я рыыыыыысь!");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Я дед инсайд =(");
    }
    @Override
    public void scream(){
        System.out.println("муррррррр");
    }
}
