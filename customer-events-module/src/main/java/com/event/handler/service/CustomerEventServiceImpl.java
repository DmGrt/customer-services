package com.event.handler.service;

import com.event.handler.model.CustomerEvent;
import com.event.handler.repository.CustomerEventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerEventServiceImpl implements CustomerEventService {
  private final CustomerEventRepository customerEventRepository;

  @Override
  public List<CustomerEvent> getAllCustomerEvents() {
    return customerEventRepository.findAll();
  }

  @Override
  public CustomerEvent getCustomerEventById(Long id) {
    return customerEventRepository
        .findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Product Event not found with id " + id));
  }

  @Override
  public CustomerEvent createCustomerEvent(CustomerEvent productEvent) {
    // Additional business logic if needed before saving to the repository
    return customerEventRepository.save(productEvent);
  }

  @Override
  public CustomerEvent updateCustomerEvent(Long id, CustomerEvent updatedProductEvent) {
    CustomerEvent existingProductEvent =
        customerEventRepository
            .findById(id)
            .orElseThrow(
                () -> new ResourceNotFoundException("Product Event not found with id " + id));

    // Update fields of existingProductEvent with the values from updatedProductEvent
    existingProductEvent.setEventType(updatedProductEvent.getEventType());
    existingProductEvent.setEventPayload(updatedProductEvent.getEventPayload());
    // ... Update other fields as needed

    // Save the updated product event to the repository
    return customerEventRepository.save(existingProductEvent);
  }

  @Override
  public void deleteCustomerEvent(Long id) {
    if (!customerEventRepository.existsById(id)) {
      throw new ResourceNotFoundException("Product Event not found with id " + id);
    }
    customerEventRepository.deleteById(id);
  }
}
