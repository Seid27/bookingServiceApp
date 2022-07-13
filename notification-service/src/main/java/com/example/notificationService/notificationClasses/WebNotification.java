package com.example.notificationService.notificationClasses;

public class WebNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Web notification");
    }
}
