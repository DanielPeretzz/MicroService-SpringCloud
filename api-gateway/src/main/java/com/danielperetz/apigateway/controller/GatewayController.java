package com.danielperetz.apigateway.controller;


import com.danielperetz.apigateway.MessageRequest;
import com.danielperetz.apigateway.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/gateway")
@RequiredArgsConstructor
public class GatewayController {

    private final MessageService messageService;

    @PostMapping
    public String gateWayRequest(@RequestBody MessageRequest messageRequest){

        System.out.println("Listener received: " + messageService.sendMessage(messageRequest));

        return "Success!!!";
    }
}
