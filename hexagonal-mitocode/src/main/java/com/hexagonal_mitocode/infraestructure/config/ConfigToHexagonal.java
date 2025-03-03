package com.hexagonal_mitocode.infraestructure.config;

import com.hexagonal_mitocode.application.adapter.CreateOrderAdapter;
import com.hexagonal_mitocode.application.adapter.GetAllOrderAdapter;
import com.hexagonal_mitocode.application.port.in.CreateOrderUseCase;
import com.hexagonal_mitocode.application.port.in.GetAllOrderUseCase;
import com.hexagonal_mitocode.application.port.out.OrderRepositoryAbs;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigToHexagonal {

    @Bean
    public CreateOrderUseCase createOrderUseCaseBean(
            @Qualifier("orderRepositoryAdapter")
            OrderRepositoryAbs orderRepositoryAbs) {
        //Estoy instanciando las implementaciones
        return new CreateOrderAdapter(orderRepositoryAbs);
    }

    @Bean
    public GetAllOrderUseCase getAllOrderUseCaseBean(
            @Qualifier("orderRepositoryAdapter")
            OrderRepositoryAbs orderRepositoryAbs) {
        //Estoy instanciando las implementaciones
        return new GetAllOrderAdapter(orderRepositoryAbs);
    }
}
