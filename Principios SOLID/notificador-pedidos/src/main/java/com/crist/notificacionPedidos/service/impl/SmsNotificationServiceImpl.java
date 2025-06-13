package com.crist.notificacionPedidos.service.impl;

import com.crist.notificacionPedidos.model.Order;
import com.crist.notificacionPedidos.service.NotificationService;

public class SmsNotificationServiceImpl implements NotificationService {

    @Override
    public void notify(Order order) {
        System.out.println("Notificacion SMS enviada a: " + order.getCustomer());
    }
}
