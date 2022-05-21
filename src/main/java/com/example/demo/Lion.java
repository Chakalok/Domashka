package com.example.demo;

import com.example.demo.events.HideEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Lion{
    private ApplicationEventPublisher publisher;
    public Lion(ApplicationEventPublisher applicationEventPublisher){
        publisher = applicationEventPublisher;
    }
    public void Hide(){
        publisher.publishEvent(new HideEvent("Lion is under the rock!"));
    }
}
