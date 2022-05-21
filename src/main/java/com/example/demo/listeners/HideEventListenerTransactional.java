package com.example.demo.listeners;

import com.example.demo.events.HideEvent;
import lombok.SneakyThrows;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@EnableTransactionManagement
@Service
public class HideEventListenerTransactional {
    @SneakyThrows
    @TransactionalEventListener
    public void listenMyEvent(HideEvent event){
        System.out.println(event.getMessage());
    }

    @TransactionalEventListener(fallbackExecution = true)
    public void listenEvent(HideEvent event){
        System.out.println(event.getMessage());
    }
    @TransactionalEventListener (phase = TransactionPhase.BEFORE_COMMIT)
    public void handleMyEvent(HideEvent event){
        System.out.println("я закончил");
    }
    @TransactionalEventListener (phase = TransactionPhase.AFTER_COMMIT)
    public void handleMyEvent2(HideEvent event){
        System.out.println("я начал");
    }
}
