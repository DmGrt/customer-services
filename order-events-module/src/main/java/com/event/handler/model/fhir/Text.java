package com.event.handler.model.fhir;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Text {
  public String status;
  public String div;
}
