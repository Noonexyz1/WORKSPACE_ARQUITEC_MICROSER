package com.hexagonal_mitocode.infraestructure.persistence.inmemory.adapter;

import com.hexagonal_mitocode.application.port.out.OrderRepositoryAbs;
import com.hexagonal_mitocode.domain.model.Order;
import com.hexagonal_mitocode.infraestructure.persistence.inmemory.mapper.InMemoryMapper;
import com.hexagonal_mitocode.infraestructure.persistence.inmemory.model.OrderInMemory;
import com.hexagonal_mitocode.infraestructure.persistence.inmemory.repository.OrderInMemoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //Esto crea un ->  new OrderRepositoryAdapter(orderInMemoryRepository) en el IoC de Spring
public class OrderRepositoryAdapter implements OrderRepositoryAbs {

    private final OrderInMemoryRepository orderInMemoryRepository;

    public OrderRepositoryAdapter(OrderInMemoryRepository orderInMemoryRepository) {
        this.orderInMemoryRepository = orderInMemoryRepository;
    }

    @Override
    public void save(Order order) {
        OrderInMemory orderInMemory = InMemoryMapper.orderToOrderInMemory(order);
        orderInMemoryRepository.createOrderRepo(orderInMemory);
    }

    @Override
    public List<Order> getAll() {
        return orderInMemoryRepository.getAllOrderRepo()
                .stream()
                .map(InMemoryMapper::orderInMemoryToOrder)
                .toList();
    }
}
