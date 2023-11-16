package com.event.handler.service;

import com.event.handler.model.ProductEvent;
import java.util.List;

public interface ProductEventService {
  List<ProductEvent> getAllProductEvents();

  ProductEvent getProductEventById(Long id);

  ProductEvent createProductEvent(ProductEvent productEvent);

  ProductEvent updateProductEvent(Long id, ProductEvent updatedProductEvent);

  void deleteProductEvent(Long id);
}
