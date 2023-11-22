package com.event.handler.controller;

import com.event.handler.kafka.EventProducer;
import com.event.handler.model.CustomerEvent;
import com.event.handler.service.CustomerEventServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer-events")
public class CustomerEventController {

  private final CustomerEventServiceImpl customerEventService;
  private final EventProducer eventProducer;

  @GetMapping
  public ResponseEntity<List<CustomerEvent>> getAllOrderEvents() {
    List<CustomerEvent> orderEvents = customerEventService.getAllCustomerEvents();
    return ResponseEntity.ok(orderEvents);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerEvent> getOrderEventById(@PathVariable Long id) {
    CustomerEvent orderEvent = customerEventService.getCustomerEventById(id);
    return orderEvent != null ? ResponseEntity.ok(orderEvent) : ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<CustomerEvent> createOrderEvent(@RequestBody CustomerEvent orderEvent) {
    CustomerEvent createdOrderEvent = customerEventService.createCustomerEvent(orderEvent);
    return new ResponseEntity<>(createdOrderEvent, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<CustomerEvent> updateOrderEvent(
      @PathVariable Long id, @RequestBody CustomerEvent orderEvent) {
    CustomerEvent updatedOrderEvent = customerEventService.updateCustomerEvent(id, orderEvent);
    return updatedOrderEvent != null
        ? ResponseEntity.ok(updatedOrderEvent)
        : ResponseEntity.notFound().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteOrderEvent(@PathVariable Long id) {
    customerEventService.deleteCustomerEvent(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/initiate")
  public void initiate() {
    eventProducer.sendCustomerEvent();
  }
}
