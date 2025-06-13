package com.crist.notificacionPedidos.service;

import com.crist.notificacionPedidos.model.Order;

public class OrderProcessorService {

    private final NotificationService notificationService;

    //Esta clase depende de NotificationService y no de EmailNotificationServiceImpl directamente por ejemplo
    public OrderProcessorService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void process(Order order) {
        System.out.println("Procesando pedido: " + order.getId());
        this.notificationService.notify(order);
    }
}
