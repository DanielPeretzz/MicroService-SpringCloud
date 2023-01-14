package com.danielperetz.appservice.service;


import com.danielperetz.appservice.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppService {

    private final RestTemplate restTemplate;



    public void sendProduce(Message message){
        final ResponseEntity<String> responseEntity = restTemplate
                .postForEntity("http://messaging-server/api/message",
                        message, String.class);
    }

    public void getConsumer(){
        final ResponseEntity<String> responseEntity = restTemplate
                .getForEntity("http://messaging-server/api/consume", String.class);

        log.info("Listener received: " + responseEntity.getBody());
    }
}
