package com.hexagonal_mitocode.application.port.out;

import com.hexagonal_mitocode.domain.model.Order;

import java.util.List;

public interface OrderRepositoryAbs {
    void save(Order order);
    List<Order> getAll();
}
