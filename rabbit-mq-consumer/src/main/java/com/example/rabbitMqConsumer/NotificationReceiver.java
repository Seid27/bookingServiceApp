package com.example.rabbitMqConsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class NotificationReceiver {

    @RabbitListener(queues = "smsQueue")
    public void smsReceiver(String in){
        System.out.println(in);
    }

    @RabbitListener(queues = "androidQueue")
    public void androidReceiver(String in){
        System.out.println(in);
    }

    @RabbitListener(queues = "iosQueue")
    public void iosReceiver(String in){
        System.out.println(in);
    }

    @RabbitListener(queues = "emailQueue")
    public void emailReceiver(String in){
        System.out.println(in);
    }

    @RabbitListener(queues = "webQueue")
    public void webReceiver(String in){
        System.out.println(in);
    }
}
