package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private  static  Monkey monkey;
    private static Lion lion;

    public DemoApplication(Monkey monkey, Lion lion){
        DemoApplication.monkey=monkey;
        DemoApplication.lion = lion;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        monkey.scream();
        lion.scream();
    }

}
