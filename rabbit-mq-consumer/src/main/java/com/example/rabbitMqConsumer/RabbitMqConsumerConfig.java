package com.example.rabbitMqConsumer;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConsumerConfig {

    @Bean
    public DirectExchange direct(){
        return new DirectExchange("notification.direct");
    }

    @Bean
    public Queue smsQueue(){
        return new Queue("smsQueue");
    }

    @Bean
    public Queue androidQueue(){
        return new Queue("androidQueue");
    }

    @Bean
    public Queue iosQueue(){
        return new Queue("iosQueue");
    }

    @Bean
    public Queue webQueue(){
        return new Queue("webQueue");
    }

    @Bean
    public Queue emailQueue(){
        return new Queue("emailQueue");
    }

    @Bean
    public Binding smsBinding(DirectExchange directExchange, Queue smsQueue){
        return BindingBuilder.bind(smsQueue)
                .to(directExchange)
                .with("sms");
    }

    @Bean
    public Binding androidBinding(DirectExchange directExchange, Queue androidQueue){
        return BindingBuilder.bind(androidQueue)
                .to(directExchange)
                .with("android");
    }

    @Bean
    public Binding iosBinding(DirectExchange directExchange, Queue iosQueue){
        return BindingBuilder.bind(iosQueue)
                .to(directExchange)
                .with("ios");
    }

    @Bean
    public Binding emailBinding(DirectExchange directExchange, Queue emailQueue){
        return BindingBuilder.bind(emailQueue)
                .to(directExchange)
                .with("email");
    }

    @Bean
    public Binding webBinding(DirectExchange directExchange, Queue webQueue ){
        return BindingBuilder.bind(webQueue)
                .to(directExchange)
                .with("web");
    }

    @Bean
    public NotificationReceiver notificationReciever(){
        return new NotificationReceiver();
    }

}
