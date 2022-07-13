package com.example.notificationService.notificationClasses;

public class EmailNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Email notification");
    }
}
