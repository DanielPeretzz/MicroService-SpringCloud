package com.danielperetz.messagingserver.listener;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class KafkaListeners {

    public static String consumeMessage;

    @KafkaListener(topics = "kafkatopic",groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data );
        consumeMessage = data;
    }



}
