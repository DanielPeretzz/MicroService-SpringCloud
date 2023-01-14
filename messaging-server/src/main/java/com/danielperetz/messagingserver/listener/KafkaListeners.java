package com.danielperetz.messagingserver.listener;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafkatopic",groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data );
    }
}
