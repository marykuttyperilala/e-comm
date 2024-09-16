package com.chinnu.ecommerce.kafka;

import java.math.BigDecimal;
import java.util.List;

import com.chinnu.ecommerce.customer.CustomerResponse;
import com.chinnu.ecommerce.order.PaymentMethod;
import com.chinnu.ecommerce.product.PurchaseResponse;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
