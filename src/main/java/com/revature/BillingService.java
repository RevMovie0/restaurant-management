package com.revature;

import org.springframework.stereotype.Component;

@Component
public class BillingService {
    public void generateBill() {
        System.out.println("Generating bill...");
    }
}
