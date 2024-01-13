package com.goit.tests.feature.order;

import com.goit.tests.feature.order.dto.CreateOrderRequest;
import com.goit.tests.feature.order.dto.CreateOrderResponse;
import com.goit.tests.feature.order.dto.OrderStateResponse;
import com.goit.tests.feature.order.status.ProblematicOrdersResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/create")
    public CreateOrderResponse create(@RequestBody CreateOrderRequest request) {
        return orderService.create(request);
    }

    @GetMapping("/state")
    public OrderStateResponse getOrderState(@RequestParam String orderId) {
        return orderService.getOrderState(orderId);
    }

    @GetMapping("/problematic")
    public ProblematicOrdersResponse getProblematicOrders() {
        return orderService.getProblematicOrders();
    }
}
