package com.example.notificationService;

import com.example.notificationService.notificationClasses.INotification;
import com.example.notificationService.notificationClasses.SMSNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NotificationController {
    @Autowired
    private ApplicationContext context;

    @GetMapping(value = "/sms")
    public String sendSms(){
        context.getBean(SMSNotification.class).send();
        return "sendingSms";
    }
    @PostMapping(value = "/email")
    public String sendEmail(){
        return "sendingEmail";
    }
}
