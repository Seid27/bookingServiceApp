package com.example.rabbitMqService.tut1;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Tut1Config {

    @Bean
    public DirectExchange direct(){
        return new DirectExchange("tut.direct");
    }

    @Bean
    public Tut1Sender sender(){
        return new Tut1Sender();
    }
}
