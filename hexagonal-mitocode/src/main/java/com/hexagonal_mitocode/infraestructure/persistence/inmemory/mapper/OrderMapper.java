package com.hexagonal_mitocode.infraestructure.persistence.inmemory.mapper;

import com.hexagonal_mitocode.domain.model.Order;
import com.hexagonal_mitocode.infraestructure.persistence.inmemory.model.OrderInMemory;

public class OrderMapper {

    private OrderMapper() {}

    public static OrderInMemory toOrderInMemory(Order order) {
        OrderInMemory orderInMemory = new OrderInMemory();
        orderInMemory.setId(order.getId());
        orderInMemory.setAmount(order.getAmount());
        orderInMemory.setProduct(order.getProduct());

        return orderInMemory;
    }

    public static Order toDomainModel(OrderInMemory orderInMemory) {
        return new Order(
                orderInMemory.getId(),
                orderInMemory.getProduct(),
                orderInMemory.getAmount());
    }
}
