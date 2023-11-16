package com.event.handler.model.fhir.adverseevent;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Identifier {
  public String system;
  public String value;
}
