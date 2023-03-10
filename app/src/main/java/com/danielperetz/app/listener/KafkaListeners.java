package com.danielperetz.app.listener;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaListeners {

    @KafkaListener(topics = "kafkatopic", groupId = "groupId")
    void listener(String data) {
        log.info("Listener received: " + data);

    }
}
