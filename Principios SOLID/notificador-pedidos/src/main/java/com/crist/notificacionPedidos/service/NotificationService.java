package com.crist.notificacionPedidos.service;

import com.crist.notificacionPedidos.model.Order;

public interface NotificationService {
    void notify(Order order);
}
