package com.hexagonal_mitocode.application.port.in;

import com.hexagonal_mitocode.domain.model.Order;

public interface CreateOrderUseCase {
    void createOrder(Order order);
}
