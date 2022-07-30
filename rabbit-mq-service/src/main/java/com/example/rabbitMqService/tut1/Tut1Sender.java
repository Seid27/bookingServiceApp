package com.example.rabbitMqService.tut1;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class Tut1Sender {
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange direct;

    public void send(){

        this.template.convertAndSend(direct.getName(),"sms","Hello to sms");
        this.template.convertAndSend(direct.getName(),"android","Hello to android");
    }
}
