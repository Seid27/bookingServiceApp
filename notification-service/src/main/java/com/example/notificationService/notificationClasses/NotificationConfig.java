package com.example.notificationService.notificationClasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Bean
    AndroidNotification androidNotification(){
        return new AndroidNotification();
    }
    @Bean
    EmailNotification emailNotification(){
        return new EmailNotification();
    }
    @Bean
    IOSNotification iosNotification(){
        return new IOSNotification();
    }
    @Bean
    SMSNotification smsNotification(){
        return new SMSNotification();
    }
    @Bean
    WebNotification webNotification(){
        return new WebNotification();
    }
}
