package com.revature;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final MenuService menuService;
    private final BillingService billingService;

    public OrderService(MenuService menuService, BillingService billingService) {
        this.menuService = menuService;
        this.billingService = billingService;
    }

    public void placeOrder() {
        menuService.displayMenu();
        System.out.println("Placing order...");
        billingService.generateBill();
    }
}
