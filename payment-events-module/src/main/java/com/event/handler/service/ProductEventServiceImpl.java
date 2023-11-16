package com.event.handler.service;

import com.event.handler.model.ProductEvent;
import com.event.handler.repository.ProductEventRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductEventServiceImpl implements ProductEventService {

  private final ProductEventRepository productEventRepository;

  @Override
  public List<ProductEvent> getAllProductEvents() {
    return productEventRepository.findAll();
  }

  @Override
  public ProductEvent getProductEventById(Long id) {
    return productEventRepository
        .findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Product Event not found with id " + id));
  }

  @Override
  public ProductEvent createProductEvent(ProductEvent productEvent) {
    // Additional business logic if needed before saving to the repository
    return productEventRepository.save(productEvent);
  }

  @Override
  public ProductEvent updateProductEvent(Long id, ProductEvent updatedProductEvent) {
    ProductEvent existingProductEvent =
        productEventRepository
            .findById(id)
            .orElseThrow(
                () -> new ResourceNotFoundException("Product Event not found with id " + id));

    // Update fields of existingProductEvent with the values from updatedProductEvent
    existingProductEvent.setName(updatedProductEvent.getName());
    existingProductEvent.setDescription(updatedProductEvent.getDescription());
    // ... Update other fields as needed

    // Save the updated product event to the repository
    return productEventRepository.save(existingProductEvent);
  }

  @Override
  public void deleteProductEvent(Long id) {
    if (!productEventRepository.existsById(id)) {
      throw new ResourceNotFoundException("Product Event not found with id " + id);
    }
    productEventRepository.deleteById(id);
  }
}
