package com.crist.notificacionPedidos;

import com.crist.notificacionPedidos.model.Order;
import com.crist.notificacionPedidos.service.NotificationService;
import com.crist.notificacionPedidos.service.OrderProcessorService;
import com.crist.notificacionPedidos.service.impl.EmailNotificationServiceImpl;
import com.crist.notificacionPedidos.service.impl.PushNotificationServiceImpl;
import com.crist.notificacionPedidos.service.impl.SmsNotificationServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        menu(reader);

        reader.close();
    }

    public static void menu(BufferedReader reader) {
        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("\nStart Menu!!");
                System.out.println("1. Request shipping by Mail");
                System.out.println("2. Request a Push Notification");
                System.out.println("3. Request a SMS Notification");
                System.out.println("4. Exit");
                System.out.println("Enter the option: ");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        Order orderMail = orderCustomer(reader);
                        if (verifyOrder(orderMail)) {
                            break;
                        }
                        NotificationService serviceMail = new EmailNotificationServiceImpl();
                        OrderProcessorService processorMail = processOrder(serviceMail);
                        processorMail.process(orderMail);
                        break;
                    case 2:
                        Order orderPush = orderCustomer(reader);
                        if (verifyOrder(orderPush)) {
                            break;
                        }
                        NotificationService servicePush = new PushNotificationServiceImpl();
                        OrderProcessorService processorPush = processOrder(servicePush);
                        processorPush.process(orderPush);
                        break;
                    case 3:
                        Order orderSms = orderCustomer(reader);
                        if (verifyOrder(orderSms)) {
                            break;
                        }
                        NotificationService serviceSms = new SmsNotificationServiceImpl();
                        OrderProcessorService processorSms = processOrder(serviceSms);
                        processorSms.process(orderSms);
                        break;
                    case 4:
                        System.out.println("Exit..");
                        exit = true;
                        break;
                    default:
                        System.out.println("Enter the option valid, please!");
                }
            } catch (IOException e) {
                System.out.println("Oh, something happened! try again!");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }
    }

    public static Order orderCustomer(BufferedReader reader) throws IOException {
        try {
            System.out.println("\nEnter '0' to exit the menu\n");
            System.out.println("Enter your name: ");
            String name = reader.readLine();
            if (verifyOption(name)) {
                return new Order();
            }

            System.out.println("\nEnter '0' to exit the menu\n");
            System.out.println("Enter the number of order: ");
            String idOrderCustomer = reader.readLine();
            if (verifyOption(idOrderCustomer)) {
                return new Order();
            }
            int idOrder = Integer.parseInt(idOrderCustomer);
            return new Order(idOrder, name);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number!");
        }
        return new Order();
    }

    public static OrderProcessorService processOrder(NotificationService service) {
        return new OrderProcessorService(service);
    }

    public static boolean verifyOption(String valueOption) {
        return valueOption.trim().equals("0");
    }

    public static boolean verifyOrder(Order order) {
        return order.getId() == null || order.getCustomer() == null;
    }
}
