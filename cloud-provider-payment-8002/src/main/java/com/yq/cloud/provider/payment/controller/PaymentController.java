package com.yq.cloud.provider.payment.controller;

import com.yq.cloud.provider.payment.domain.Payment;
import com.yq.cloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add/payment")
    public String addPayment(@RequestParam(name = "paySerial", required = true) String paySerial) {

        Payment payment = new Payment();
        payment.setPaySerial(paySerial);
        int result=paymentService.create(payment);

        if(result>0){
               return "success";
        }

        else {
                return "fail";
        }
    }


    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment/pay_id/{id}")
    public String queryPayment(@PathVariable("id") Long id){

        log.info("123");
        return serverPort+":"+paymentService.getPaymentById(id).toString();
    }

}
