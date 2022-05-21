package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("monkey")
public class Monkey implements IAnimal {
    @Autowired
    private Movement movement;
    @PostConstruct
    public void postConstruct(){
        System.out.println("У аппарата!");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("Гулем не рождаются, гулем становятся");
    }
    @Override
    public void scream(){
        System.out.println("123!");
    }
    public void Walk(){
        movement.Walk();
    }
}

