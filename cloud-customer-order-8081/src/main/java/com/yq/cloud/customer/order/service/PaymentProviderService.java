package com.yq.cloud.customer.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "cloud-provider-payment")
public interface PaymentProviderService {

    @GetMapping("/payment/pay_id/{id}")
    public String getById(@PathVariable("id") String id);
}
