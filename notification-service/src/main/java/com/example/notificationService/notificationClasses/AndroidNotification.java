package com.example.notificationService.notificationClasses;


public class AndroidNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Android notification");
    }
}
