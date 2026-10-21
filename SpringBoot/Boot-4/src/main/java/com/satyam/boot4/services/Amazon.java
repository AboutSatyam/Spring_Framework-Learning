package com.satyam.boot4.services;

import org.springframework.stereotype.Service;

@Service
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
