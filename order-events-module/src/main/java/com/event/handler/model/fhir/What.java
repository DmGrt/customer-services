package com.event.handler.model.fhir;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class What {
  public Identifier identifier;
}
