package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    private int FirstApiUsages;
    private int SecondApiUsages;
    @Value("${my.usages}")
    private int MaxUsages;

    @Before("execution(public String Controller.firstApi())")
    public void BeforeFirstApi() throws Exception {
        if (FirstApiUsages < MaxUsages) {
            FirstApiUsages++;
        }
        else
            throw new Exception("Exceeded maximum amount of requests per N, API 1");
    }

    @Before("execution(public String Controller.secondApi())")
    public void BeforeSecondApi() throws Exception {
        if (SecondApiUsages < MaxUsages) {
            SecondApiUsages++;
        }
        else
            throw new Exception("Exceeded maximum amount of requests per N, API 2");
    }
}


