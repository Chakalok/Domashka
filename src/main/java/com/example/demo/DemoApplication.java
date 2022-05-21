package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static Lion lion;

    public DemoApplication(Lion lion){
        DemoApplication.lion = lion;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        lion.Hide();
    }

}
