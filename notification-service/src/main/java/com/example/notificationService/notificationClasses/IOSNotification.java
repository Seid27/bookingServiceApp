package com.example.notificationService.notificationClasses;

public class IOSNotification implements INotification {
    @Override
    public void send() {
        System.out.println("IOS notification");
    }
}
