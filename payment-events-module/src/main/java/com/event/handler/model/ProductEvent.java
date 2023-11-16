package com.event.handler.model;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("productevent")
@NoArgsConstructor
@AllArgsConstructor
public class ProductEvent {

  @Id private Long productId;
  private String name;
  @Lob private String description;

  private String eventType;
  private String eventPayload;
  private long timestamp;
}
