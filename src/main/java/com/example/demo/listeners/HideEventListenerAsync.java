package com.example.demo.listeners;

import com.example.demo.events.HideEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
@Service
@EnableAsync
public class HideEventListenerAsync {
    @EventListener
    @Async
    public void listenMyEvent(HideEvent event) throws InterruptedException {
        Thread.sleep(2500);
        System.out.println(event.getMessage());
    }
}

