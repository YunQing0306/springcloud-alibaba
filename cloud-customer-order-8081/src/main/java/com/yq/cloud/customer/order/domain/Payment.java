package com.yq.cloud.customer.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    /**
    * 编号
    */
    private Long payId;

    private String paySerial;
}