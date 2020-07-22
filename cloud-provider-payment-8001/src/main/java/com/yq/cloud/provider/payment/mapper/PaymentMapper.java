package com.yq.cloud.provider.payment.mapper;

import com.yq.cloud.provider.payment.domain.Payment;

public interface PaymentMapper {
    int deleteByPrimaryKey(Long payId);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Long payId);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}