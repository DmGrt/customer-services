package com.event.handler.service;

import com.event.handler.model.OrderEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderEventService {
  List<OrderEvent> getAllOrderEvents();

  OrderEvent getOrderEventById(Long id);

  OrderEvent createOrderEvent(OrderEvent orderEvent);

  OrderEvent updateOrderEvent(Long id, OrderEvent updatedOrderEvent);

  void deleteOrderEvent(Long id);
}
