package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

    @PostMapping("/second")
    public Data GetAllData(@RequestBody Data data) {
        var random = new Random();
        data.getInfo().setId(random.nextInt(1000));
        return data;
    }
}
