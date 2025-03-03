package com.hexagonal_mitocode.application.adapter;

import com.hexagonal_mitocode.application.port.in.CreateOrderUseCase;
import com.hexagonal_mitocode.application.port.out.OrderRepositoryAbs;
import com.hexagonal_mitocode.domain.model.Order;

public class CreateOrderAdapter implements CreateOrderUseCase {

    private final OrderRepositoryAbs orderRepositoryAbs;

    public CreateOrderAdapter(OrderRepositoryAbs orderRepositoryAbs) {
        this.orderRepositoryAbs = orderRepositoryAbs;
    }

    @Override
    public void createOrder(Order order) {
        orderRepositoryAbs.save(order);
    }
}
