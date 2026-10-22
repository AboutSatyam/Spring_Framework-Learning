package com.satyam.boot4.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstFlight implements IDelivery {

    public FirstFlight() {
        System.out.println("FirstFlight Bean Is Created ");
    }

    @Override
    public Boolean deliveryTheProduct(Double Amount) {
        System.out.println("Product Delivered With FirstFlight " + Amount);
        return true;
    }
}
