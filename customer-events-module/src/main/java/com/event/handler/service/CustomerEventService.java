package com.event.handler.service;

import com.event.handler.model.CustomerEvent;

import java.util.List;

public interface CustomerEventService {
  List<CustomerEvent> getAllCustomerEvents();

  CustomerEvent getCustomerEventById(Long id);

  CustomerEvent createCustomerEvent(CustomerEvent productEvent);

  CustomerEvent updateCustomerEvent(Long id, CustomerEvent updatedProductEvent);

  void deleteCustomerEvent(Long id);
}
