package com.hexagonal_mitocode.infraestructure.rest.mapper;

import com.hexagonal_mitocode.domain.model.Order;
import com.hexagonal_mitocode.infraestructure.rest.model.OrderWebModel;

public class RestMapper {

    public static OrderWebModel orderToOrderWebModel(Order order) {
        return new OrderWebModel(
                order.getId(),
                order.getProduct(),
                order.getAmount());
    }

    public static Order orderWebModelToOrder(OrderWebModel orderWebModel) {
        return new Order(
                orderWebModel.id(),
                orderWebModel.product(),
                orderWebModel.amount());
    }
}
