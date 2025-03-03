package com.hexagonal_mitocode.infraestructure.rest.model;

import com.hexagonal_mitocode.domain.model.Order;

public record OrderWebModel(
        Long id,
        String product,
        Long amount) {

    public static OrderWebModel fromDomainModel(Order order) {
        return new OrderWebModel(
                order.getId(),
                order.getProduct(),
                order.getAmount());
    }

    public static Order toDomainModel(OrderWebModel orderWebModel) {
        return new Order(
                orderWebModel.id(),
                orderWebModel.product(),
                orderWebModel.amount());
    }
}
