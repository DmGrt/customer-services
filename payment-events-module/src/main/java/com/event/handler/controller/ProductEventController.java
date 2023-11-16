package com.event.handler.controller;

import com.event.handler.kafka.EventProducer;
import com.event.handler.model.ProductEvent;
import com.event.handler.service.ProductEventService;
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
@RequestMapping("/api/payment-events")
@RequiredArgsConstructor
public class ProductEventController {

  private final ProductEventService productEventService;
  private final EventProducer eventProducer;

  @GetMapping
  public ResponseEntity<List<ProductEvent>> getAllProductEvents() {
    List<ProductEvent> productEvents = productEventService.getAllProductEvents();
    return ResponseEntity.ok(productEvents);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ProductEvent> getProductEventById(@PathVariable Long id) {
    ProductEvent productEvent = productEventService.getProductEventById(id);
    return productEvent != null
        ? ResponseEntity.ok(productEvent)
        : ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<ProductEvent> createProductEvent(@RequestBody ProductEvent productEvent) {
    ProductEvent createdProductEvent = productEventService.createProductEvent(productEvent);
    return new ResponseEntity<>(createdProductEvent, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ProductEvent> updateProductEvent(
      @PathVariable Long id, @RequestBody ProductEvent productEvent) {
    ProductEvent updatedProductEvent = productEventService.updateProductEvent(id, productEvent);
    return updatedProductEvent != null
        ? ResponseEntity.ok(updatedProductEvent)
        : ResponseEntity.notFound().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteProductEvent(@PathVariable Long id) {
    productEventService.deleteProductEvent(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/initiate")
  public void initiate() {
    for (int i = 0; i < 20; i++) {
      eventProducer.sendEdi();
      eventProducer.sendInvoice();
    }
  }
}
