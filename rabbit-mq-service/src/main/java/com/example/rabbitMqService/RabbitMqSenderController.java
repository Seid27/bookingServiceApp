package com.example.rabbitMqService;

import com.example.rabbitMqService.tut1.Tut1Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqSenderController {
    @Autowired
    private Tut1Sender tut1Sender;

    public RabbitMqSenderController(Tut1Sender tut1Sender) {
        this.tut1Sender = tut1Sender;
    }

    @PostMapping(value = "/send")
    public String sendMessage(){
        tut1Sender.send();
        return "message sent";
    }

}
