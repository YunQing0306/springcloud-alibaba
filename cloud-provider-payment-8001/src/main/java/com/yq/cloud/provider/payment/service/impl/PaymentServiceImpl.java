package com.yq.cloud.provider.payment.service.impl;

import com.yq.cloud.provider.payment.domain.Payment;
import com.yq.cloud.provider.payment.mapper.PaymentMapper;
import com.yq.cloud.provider.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        int result=paymentMapper.insert(payment);
        return result;
    }

    @Override
    public Payment getPaymentById(Long id) {

        Payment payment=paymentMapper.selectByPrimaryKey(id);
        return payment;
    }
}
