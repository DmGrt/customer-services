package com.event.handler.controller;

import com.event.handler.kafka.EventProducer;
import com.event.handler.model.OrderEvent;
import com.event.handler.service.OrderEventService;
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
@RequestMapping("/api/order-events")
public class OrderEventController {

    private final OrderEventService orderEventService;
    private final EventProducer eventProducer;

    @GetMapping
    public ResponseEntity<List<OrderEvent>> getAllOrderEvents() {
        List<OrderEvent> orderEvents = orderEventService.getAllOrderEvents();
        return ResponseEntity.ok(orderEvents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderEvent> getOrderEventById(@PathVariable Long id) {
        OrderEvent orderEvent = orderEventService.getOrderEventById(id);
        return orderEvent != null ?
                ResponseEntity.ok(orderEvent) :
                ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<OrderEvent> createOrderEvent(@RequestBody OrderEvent orderEvent) {
        OrderEvent createdOrderEvent = orderEventService.createOrderEvent(orderEvent);
        return new ResponseEntity<>(createdOrderEvent, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderEvent> updateOrderEvent(@PathVariable Long id, @RequestBody OrderEvent orderEvent) {
        OrderEvent updatedOrderEvent = orderEventService.updateOrderEvent(id, orderEvent);
        return updatedOrderEvent != null ?
                ResponseEntity.ok(updatedOrderEvent) :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderEvent(@PathVariable Long id) {
        orderEventService.deleteOrderEvent(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/initiate")
    public void initiate() {
        for (int i = 0; i < 20; i++) {
            eventProducer.sendFhir();
        }
    }
}