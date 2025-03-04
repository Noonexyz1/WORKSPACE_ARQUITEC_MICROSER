package com.hexagonal_mitocode.infraestructure.persistence.inmemory.mapper;

import com.hexagonal_mitocode.domain.model.Order;
import com.hexagonal_mitocode.infraestructure.persistence.inmemory.model.OrderInMemory;

public class InMemoryMapper {

    public static OrderInMemory orderToOrderInMemory(Order order) {
        OrderInMemory orderInMemory = new OrderInMemory();
        orderInMemory.setId(order.getId());
        orderInMemory.setAmount(order.getAmount());
        orderInMemory.setProduct(order.getProduct());

        return orderInMemory;
    }

    public static Order orderInMemoryToOrder(OrderInMemory orderInMemory) {
        return new Order(
                orderInMemory.getId(),
                orderInMemory.getProduct(),
                orderInMemory.getAmount());
    }
}
