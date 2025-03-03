package com.hexagonal_mitocode.application.adapter;

import com.hexagonal_mitocode.application.port.in.GetAllOrderUseCase;
import com.hexagonal_mitocode.application.port.out.OrderRepositoryAbs;
import com.hexagonal_mitocode.domain.model.Order;

import java.util.List;

public class GetAllOrderAdapter implements GetAllOrderUseCase {

    private final OrderRepositoryAbs orderRepositoryAbs;

    public GetAllOrderAdapter(OrderRepositoryAbs orderRepositoryAbs) {
        this.orderRepositoryAbs = orderRepositoryAbs;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepositoryAbs.getAll();
    }
}
