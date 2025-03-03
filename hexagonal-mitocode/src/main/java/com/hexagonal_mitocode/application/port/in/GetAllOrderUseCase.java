package com.hexagonal_mitocode.application.port.in;

import com.hexagonal_mitocode.domain.model.Order;

import java.util.List;

public interface GetAllOrderUseCase {
    List<Order> getAllOrders();
}
