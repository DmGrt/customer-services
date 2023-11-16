package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class CUX01 {
  @JsonProperty("CUX_01_01")
  public String cUX_01_01;

  @JsonProperty("CUX_01_02")
  public String cUX_01_02;
}
