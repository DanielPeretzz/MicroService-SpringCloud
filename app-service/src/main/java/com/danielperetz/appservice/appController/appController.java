package com.danielperetz.appservice.appController;


import com.danielperetz.appservice.Message;
import com.danielperetz.appservice.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service")
@RequiredArgsConstructor
public class appController {
    private final AppService appService;

    @PostMapping
    public String service(@RequestBody Message message){
        appService.sendProduce(message);
        appService.getConsumer();
        return "Success!";
    }
}
