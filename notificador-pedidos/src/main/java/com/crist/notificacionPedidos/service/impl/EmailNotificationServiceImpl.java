package com.crist.notificacionPedidos.service.impl;

import com.crist.notificacionPedidos.model.Order;
import com.crist.notificacionPedidos.service.NotificationService;

public class EmailNotificationServiceImpl implements NotificationService {

    @Override
    public void notify(Order order) {
        System.out.println("Correo enviado a: " + order.getCustomer());
    }
}
