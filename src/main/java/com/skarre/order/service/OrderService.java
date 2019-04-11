package com.skarre.order.service;

import com.skarre.order.model.Order;
import com.skarre.order.persistencelayer.OrderDataAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDataAccessor orderDataAccessor;

    public Order createOrder(Order order) {

        //return orderDataAccessor.createOrder(order);
        return null;
    }
}
