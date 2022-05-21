package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private Monkey monkey;
    private Lion lion;
    public Zoo(){
    }
    @Autowired
    public void setMonkey(Monkey monkey){
        this.monkey=monkey;
    }
    @Autowired
    public void setLion(Lion lion){
        this.lion=lion;
    }
}
