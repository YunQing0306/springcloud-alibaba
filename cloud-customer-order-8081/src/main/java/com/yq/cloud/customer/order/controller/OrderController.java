package com.yq.cloud.customer.order.controller;

import com.yq.cloud.customer.order.service.PaymentProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private PaymentProviderService paymentProviderService;

    @GetMapping(value = "/order/get/{id}")
    public String getOrder(@PathVariable("id") String id){
        String result=paymentProviderService.getById(id);

        return result;
    }
}
