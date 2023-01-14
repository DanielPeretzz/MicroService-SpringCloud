package com.danielperetz.apigateway.service;


import com.danielperetz.apigateway.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final RestTemplate restTemplate;

    public String sendMessage(MessageRequest messageRequest){

        final ResponseEntity<String> entityResponse = restTemplate
                .postForEntity("http://MESSAGING-SERVER/api/message",
                        messageRequest, String.class);

        return entityResponse.getBody();
    }
}
