package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class NAD02 {
  @JsonProperty("NAD_02_01")
  public String nAD_02_01;

  @JsonProperty("NAD_02_03")
  public String nAD_02_03;
}
