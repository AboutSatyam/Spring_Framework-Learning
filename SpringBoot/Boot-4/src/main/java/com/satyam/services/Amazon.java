package com.satyam.services;

import org.springframework.stereotype.Component;

@Component
public class Amazon {

    private IDelivery service;

    public Amazon(IDelivery service) {
        this.service = service;
        System.out.println("Amazon Bean Created Constructor ");
    }

    public Boolean deliverProduct(Double amount) {
        service.deliveryTheProduct(738.3);
        return true;
    }
}
