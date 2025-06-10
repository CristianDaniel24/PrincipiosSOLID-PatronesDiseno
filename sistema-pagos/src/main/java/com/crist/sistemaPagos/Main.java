package com.crist.sistemaPagos;

import com.crist.sistemaPagos.model.Payment;
import com.crist.sistemaPagos.service.notification.Impl.EmailNotificationImpl;
import com.crist.sistemaPagos.service.notification.Impl.SmsNotificationImpl;
import com.crist.sistemaPagos.service.notification.NotificationService;
import com.crist.sistemaPagos.service.payment.PaymentMethod;
import com.crist.sistemaPagos.service.payment.PaymentProcessor;
import com.crist.sistemaPagos.service.payment.impl.CreditCardPaymentImpl;
import com.crist.sistemaPagos.service.payment.impl.CryptoPaymentImpl;
import com.crist.sistemaPagos.service.payment.impl.PaypalPaymentImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        menuInit(reader);

        reader.close();
    }

    public static void menuInit(BufferedReader reader) {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Enter the method payment");
                System.out.println("2. Exit");
                System.out.println("Enter the option:");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        menuPayment(reader);
                        break;
                    case 2:
                        System.out.println("Exit..");
                        exit = true;
                        break;
                    default:
                        System.out.println("Please, enter the option valid");
                }
            } catch (IOException e) {
                System.out.println("Oh, something happened");
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please!");
            }
        }
    }

    public static void menuPayment(BufferedReader reader) {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu to payment");
                System.out.println("1. Payment with Credit card");
                System.out.println("2. Payment with Cryptocurrencies");
                System.out.println("3. Payment with Paypal");
                System.out.println("4. Exit");
                System.out.println("Enter the option: ");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        PaymentMethod paymentCreditCard = new CreditCardPaymentImpl();
                        Payment dataCreditCard = dataCustomer(reader);
                        if (verifyDataPayment(dataCreditCard)) {
                            break;
                        }
                        menuNotification(reader, paymentCreditCard, dataCreditCard);
                        return;
                    case 2:
                        PaymentMethod paymentCryptocurrencies = new CryptoPaymentImpl();
                        Payment dataCryptocurrencies = dataCustomer(reader);
                        if (verifyDataPayment(dataCryptocurrencies)) {
                            break;
                        }
                        menuNotification(reader, paymentCryptocurrencies, dataCryptocurrencies);
                        return;
                    case 3:
                        PaymentMethod paymentPaypal = new PaypalPaymentImpl();
                        Payment dataPayment = dataCustomer(reader);
                        if (verifyDataPayment(dataPayment)) {
                            break;
                        }
                        menuNotification(reader, paymentPaypal, dataPayment);
                        return;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Enter the valid option!");
                }
            } catch (IOException e) {
                System.out.println("Oh, something happened");
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please!");
            }
        }
    }

    public static void menuNotification(BufferedReader reader, PaymentMethod paymentMethod, Payment payment) {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nMenu to Notification");
                System.out.println("1. Email Notification");
                System.out.println("2. Sms Notification");
                System.out.println("3. Exit");
                System.out.println("Enter the option: ");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        NotificationService notificationMail = new EmailNotificationImpl();
                        PaymentProcessor processorMail = new PaymentProcessor(paymentMethod, notificationMail);
                        processorMail.processPayment(payment);
                        return;
                    case 2:
                        NotificationService notificationSms = new SmsNotificationImpl();
                        PaymentProcessor processorSms = new PaymentProcessor(paymentMethod, notificationSms);
                        processorSms.processPayment(payment);
                        return;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Enter the valid option!");
                }
            } catch (IOException e) {
                System.out.println("Oh, something happened");
            } catch (NumberFormatException e) {
                System.out.println("Enter the number, please!");
            }
        }
    }

    public static Payment dataCustomer(BufferedReader reader) {
        try {
            System.out.println("\nEnter '0' to exit:\n");
            System.out.println("Enter your name: ");
            String name = reader.readLine();
            if (verifyOption(name)) {
                return new Payment();
            }

            System.out.println("\nEnter '0' to exit:\n");
            System.out.println("Enter the amount you wish to pay");
            String amountInput = reader.readLine();
            if (verifyOption(amountInput)) {
                return new Payment();
            }
            Double amount = Double.parseDouble(amountInput);
            return new Payment(amount, name, LocalDateTime.now());
        } catch (IOException e) {
            System.out.println("Oh, something happened");
        } catch (NumberFormatException e) {
            System.out.println("Enter the number, please!");
        }
        return new Payment();
    }

    public static boolean verifyOption(String value) {
        return value.trim().equals("0");
    }

    public static boolean verifyDataPayment(Payment dataCreditCard) {
        return dataCreditCard.getCustomer() == null || dataCreditCard.getAmount() == null;
    }
}
