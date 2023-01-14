package com.danielperetz.messagingserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.danielperetz.messagingserver.listener.KafkaListeners.consumeMessage;

@RestController
@RequestMapping("api/consume")
public class ConsumerController {

    @GetMapping
    public String consume(){
        return consumeMessage;
    }
}
