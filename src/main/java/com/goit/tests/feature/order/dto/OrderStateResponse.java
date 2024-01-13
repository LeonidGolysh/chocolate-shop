package com.goit.tests.feature.order.dto;

import com.goit.tests.feature.order.status.OrderStatusDto;
import lombok.Data;

import java.util.List;

@Data
public class OrderStateResponse {
    private List<OrderStatusDto> statuses;
}
