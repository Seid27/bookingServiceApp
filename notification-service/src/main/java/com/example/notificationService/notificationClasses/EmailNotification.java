package com.example.notificationService.notificationClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class EmailNotification implements INotification {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    Notification notification;

    @Override
    public void send() {
        notification.setBody("Hello from email @ notification server");
        Notification sentNotification = webClientBuilder.build()
                        .post()
                        .uri("http://localhost:8085/sendNotification")
                .retrieve()
                .bodyToMono(Notification.class)
                .block();
        System.out.println("Email notification");
    }
}