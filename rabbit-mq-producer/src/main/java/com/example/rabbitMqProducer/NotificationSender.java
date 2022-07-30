package com.example.rabbitMqProducer;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class NotificationSender {
    @Autowired
    private DirectExchange direct;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        this.rabbitTemplate.convertAndSend(direct.getName(),"email","hello email");
    }
}
