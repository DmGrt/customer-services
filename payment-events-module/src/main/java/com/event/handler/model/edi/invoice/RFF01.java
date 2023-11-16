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
public class RFF01 {
  @JsonProperty("RFF_01_01")
  public String rFF_01_01;

  @JsonProperty("RFF_01_02")
  public String rFF_01_02;
}
