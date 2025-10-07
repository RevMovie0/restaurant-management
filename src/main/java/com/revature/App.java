package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Restaurant Management
 * Classes: OrderService, MenuService, BillingService
 * OrderService uses MenuService and BillingService.
 * Spring manages all these dependencies.
 * 
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        context.close();
    }
}
