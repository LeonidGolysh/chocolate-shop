package com.goit.tests.feature.order.dto;

import lombok.Data;

@Data
public class CreateOrderResponse {
    private  String orderId;
    private int price;
}
