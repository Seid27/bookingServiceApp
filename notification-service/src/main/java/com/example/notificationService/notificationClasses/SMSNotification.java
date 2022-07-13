package com.example.notificationService.notificationClasses;

public class SMSNotification implements INotification {
    @Override
    public void send() {
        System.out.println("SMS notification");
    }
}
