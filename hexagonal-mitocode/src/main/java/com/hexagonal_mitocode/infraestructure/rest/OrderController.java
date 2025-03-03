package com.hexagonal_mitocode.infraestructure.rest;

import com.hexagonal_mitocode.application.port.in.CreateOrderUseCase;
import com.hexagonal_mitocode.application.port.in.GetAllOrderUseCase;

// IMPORTANTE: Order es un modelo de dominio que representa únicamente datos, no una dependencia entre capas.
// Su uso aquí no viola la arquitectura hexagonal, ya que no implica un flujo de lógica de negocio hacia la infraestructura.
// Order actúa como un contenedor de datos para transformar entre el modelo web (OrderWebModel) y el dominio.
// El desacoplamiento se mantiene porque la infraestructura no conoce la lógica de negocio de la siguiente capa,
// solo maneja datos.
// Cuando hablamos de que cada capa no debe conocer los detalles de la siguiente, nos referimos al cómo fluyen los datos
// y cómo interactúan las funcionalidades mediante las implementaciones de sus dependencias.
// Order es simplemente una representación de datos sin lógica, a diferencia de los componentes que gestionan
// el flujo de operaciones y la interacción entre capas como ser las dependencias.
import com.hexagonal_mitocode.domain.model.Order;

import com.hexagonal_mitocode.infraestructure.rest.model.OrderWebModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CreateOrderUseCase createOrderUseCase;
    private final GetAllOrderUseCase getAllOrderUseCase;

    public OrderController(
            CreateOrderUseCase createOrderUseCase,
            GetAllOrderUseCase getAllOrderUseCase) {

        this.createOrderUseCase = createOrderUseCase;
        this.getAllOrderUseCase = getAllOrderUseCase;
    }

    @PostMapping
    public void createOrder(@RequestBody OrderWebModel orderWebModel) {
        // Transformación del modelo web (OrderWebModel) al modelo de dominio (Order).
        // Esto no viola la arquitectura hexagonal, ya que es una simple conversión de datos.
        Order order = OrderWebModel.toDomainModel(orderWebModel);
        createOrderUseCase.createOrder(order); // Delegación al caso de uso.
    }

    @GetMapping
    public List<OrderWebModel> getAllOrders() {
        // Obtención de las órdenes desde el caso de uso y transformación al modelo web.
        // Nuevamente, Order es solo un modelo de datos, no una dependencia acoplada.
        List<Order> orders = getAllOrderUseCase.getAllOrders();
        return orders.stream()
                .map(OrderWebModel::fromDomainModel) // Conversión a OrderWebModel.
                .toList();
    }
}