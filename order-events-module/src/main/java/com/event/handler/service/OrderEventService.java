package com.event.handler.service;

import com.event.handler.model.OrderEvent;
import java.util.List;

public interface OrderEventService {
  List<OrderEvent> getAllOrderEvents();

  OrderEvent getOrderEventById(Long id);

  OrderEvent createOrderEvent(OrderEvent orderEvent);

  OrderEvent updateOrderEvent(Long id, OrderEvent updatedOrderEvent);

  void deleteOrderEvent(Long id);
}
