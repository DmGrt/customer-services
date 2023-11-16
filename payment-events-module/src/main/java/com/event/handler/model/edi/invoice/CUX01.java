package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CUX01 {
  @JsonProperty("CUX_01_01")
  public String cUX_01_01;

  @JsonProperty("CUX_01_02")
  public String cUX_01_02;
}
