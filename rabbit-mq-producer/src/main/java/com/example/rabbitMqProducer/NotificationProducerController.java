package com.example.rabbitMqProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationProducerController {
    @Autowired
    public NotificationSender notificationSender;
    @PostMapping(value = "/sendNotification")
    public void sendNotification(){
        System.out.println("sending notification");
        notificationSender.send();
    }

}
