package com.crist.sistemaPagos.service.payment;

import com.crist.sistemaPagos.model.Payment;
import com.crist.sistemaPagos.service.notification.NotificationService;

public class PaymentProcessor {

    private final PaymentMethod paymentMethod;
    private final NotificationService notificationService;

    public PaymentProcessor(PaymentMethod paymentMethod, NotificationService notificationService) {
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    public void processPayment(Payment payment) {
        this.paymentMethod.pay(payment.getAmount());
        this.notificationService.sendNotification("Processed: " + payment);
    }
}
