package com.hexagonal_mitocode.infraestructure.persistence.inmemory.repository;

import com.hexagonal_mitocode.infraestructure.persistence.inmemory.model.OrderInMemory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderInMemoryRepository {

    List<OrderInMemory> orderInMemoryList = new ArrayList<>();

    public void createOrderRepo(OrderInMemory orderInMemory) {
        orderInMemoryList.add(orderInMemory);
    }

    public List<OrderInMemory> getAllOrderRepo() {
        return orderInMemoryList;
    }
}
