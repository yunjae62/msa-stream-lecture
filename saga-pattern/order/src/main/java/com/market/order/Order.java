package com.market.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private UUID orderId;
    private String userId;
    private String orderStatus;
    private String errorType;

    public void cancelOrder(String receiveErrorType) {
        orderStatus = "CANCELLED";
        errorType = receiveErrorType;
    }
}