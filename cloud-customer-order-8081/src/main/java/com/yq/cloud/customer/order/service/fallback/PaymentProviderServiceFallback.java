package com.yq.cloud.customer.order.service.fallback;

import com.yq.cloud.customer.order.service.PaymentProviderService;

public class PaymentProviderServiceFallback implements PaymentProviderService {

    @Override
    public String getById(String id) {
        return "/(ㄒoㄒ)/~~";
    }
}
