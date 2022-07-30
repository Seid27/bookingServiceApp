package com.example.rabbitMqProducer;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqProducerConfig {
    @Bean
    public DirectExchange direct(){
        return new DirectExchange("notification.direct");
    }

    @Bean
    public NotificationSender notificationSender(){
        return new NotificationSender();
    }
}
