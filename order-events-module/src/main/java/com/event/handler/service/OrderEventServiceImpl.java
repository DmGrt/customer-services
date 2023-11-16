package com.event.handler.service;

import com.event.handler.model.OrderEvent;
import com.event.handler.repository.OrderEventRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderEventServiceImpl implements OrderEventService {

  private final OrderEventRepository orderEventRepository;

  @Override
  public List<OrderEvent> getAllOrderEvents() {
    return orderEventRepository.findAll();
  }

  @Override
  public OrderEvent getOrderEventById(Long id) {
    return orderEventRepository.findById(id).orElse(null);
  }

  @Override
  public OrderEvent createOrderEvent(OrderEvent orderEvent) {
    return orderEventRepository.save(orderEvent);
  }

  @Override
  public OrderEvent updateOrderEvent(Long id, OrderEvent updatedOrderEvent) {

    if (orderEventRepository.existsById(id)) {
      OrderEvent orderEvent = orderEventRepository.findById(id).orElseThrow();
      orderEvent.setEventPayload(updatedOrderEvent.getEventPayload());
      orderEvent.setEventType(updatedOrderEvent.getEventType());
    }

    return null;
  }

  @Override
  public void deleteOrderEvent(Long id) {
    orderEventRepository.deleteById(id);
  }
}
