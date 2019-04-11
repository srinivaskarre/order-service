package com.skarre.order.resource;

import com.skarre.order.model.Order;
import com.skarre.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderResource {

    @Autowired
    private OrderService orderService;
    @PutMapping
    public Order createOrder(@RequestBody final Order order){
        return orderService.createOrder(order);

    }
}
