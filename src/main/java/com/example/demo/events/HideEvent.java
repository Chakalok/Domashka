package com.example.demo.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableTransactionManagement
public class HideEvent {
    @Getter
    private final String message;

    public HideEvent( String message){
        this.message=message;
    }
}
