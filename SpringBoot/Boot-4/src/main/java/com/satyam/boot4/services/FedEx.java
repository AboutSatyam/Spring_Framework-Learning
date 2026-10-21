package com.satyam.boot4.services;

import org.springframework.stereotype.Service;

@Service
public class FedEx implements IDelivery {
    public FedEx() {
        System.out.println("FedEx Bean Creted ");
    }


    @Override
    public Boolean deliveryTheProduct(Double Amount) {
        System.out.println("Product Delivered With Fedex " + Amount);
        return true;
    }
}
