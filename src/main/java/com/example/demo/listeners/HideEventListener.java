package com.example.demo.listeners;

import com.example.demo.events.HideEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class HideEventListener {
    @EventListener
    public void listenMyEvent(HideEvent event){
        System.out.println(event.getMessage());
    }
}
