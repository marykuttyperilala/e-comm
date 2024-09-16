package com.chinnu.ecommerce.payment;

import java.math.BigDecimal;

import com.chinnu.ecommerce.customer.CustomerResponse;
import com.chinnu.ecommerce.order.PaymentMethod;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
