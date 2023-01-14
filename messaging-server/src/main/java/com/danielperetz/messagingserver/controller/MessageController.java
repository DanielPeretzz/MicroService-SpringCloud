package com.danielperetz.messagingserver.controller;




import com.danielperetz.messagingserver.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/message")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping
    public String publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("kafkatopic", request.getMessage());
        return request.getMessage();
    }

}
