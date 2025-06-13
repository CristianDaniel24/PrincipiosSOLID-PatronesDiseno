package com.crist.sistemaPagos.service.notification.Impl;

import com.crist.sistemaPagos.service.notification.NotificationService;

public class SmsNotificationImpl implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notification:\n" + message);
    }
}
