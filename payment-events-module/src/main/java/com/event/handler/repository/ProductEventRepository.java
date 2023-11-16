package com.event.handler.repository;

import com.event.handler.model.ProductEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductEventRepository extends MongoRepository<ProductEvent, Long> {}
