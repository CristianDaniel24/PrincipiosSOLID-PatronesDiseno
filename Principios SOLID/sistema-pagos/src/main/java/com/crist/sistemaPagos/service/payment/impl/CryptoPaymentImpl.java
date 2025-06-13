package com.crist.sistemaPagos.service.payment.impl;

import com.crist.sistemaPagos.service.payment.PaymentMethod;

public class CryptoPaymentImpl implements PaymentMethod {

    @Override
    public void pay(Double amount) {
        System.out.println("\nPayment with cryptocurrencies: $" + amount);
    }
}
