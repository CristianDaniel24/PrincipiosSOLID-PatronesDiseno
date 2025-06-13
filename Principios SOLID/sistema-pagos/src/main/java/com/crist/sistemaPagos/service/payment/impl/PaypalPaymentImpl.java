package com.crist.sistemaPagos.service.payment.impl;

import com.crist.sistemaPagos.service.payment.PaymentMethod;

public class PaypalPaymentImpl implements PaymentMethod {

    @Override
    public void pay(Double amount) {
        System.out.println("\nPayment with paypal: $" + amount);
    }
}
