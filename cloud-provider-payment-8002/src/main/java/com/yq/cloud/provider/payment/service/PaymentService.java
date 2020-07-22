package com.yq.cloud.provider.payment.service;

import com.yq.cloud.provider.payment.domain.Payment;

public interface PaymentService {


    public int create(Payment payment); //写

    public Payment getPaymentById(Long id);  //读取

}
