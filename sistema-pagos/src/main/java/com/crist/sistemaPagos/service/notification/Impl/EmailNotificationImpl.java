package com.crist.sistemaPagos.service.notification.Impl;

import com.crist.sistemaPagos.service.notification.NotificationService;

public class EmailNotificationImpl implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification:\n" + message);
    }
}
