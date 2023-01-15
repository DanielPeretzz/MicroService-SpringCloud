package com.danielperetz.app.controller;




import com.danielperetz.app.MessageRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/message")
@RequiredArgsConstructor
@Slf4j
public class ProducerController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public String publish(@RequestBody MessageRequest request) {
        kafkaTemplate.send("kafkatopic", request.getMessage());
        log.info("Produce Received: " + request.getMessage());
        return "Success!!!";
    }


}
