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
public class LIN03 {
  @JsonProperty("LIN_03_01")
  public String lIN_03_01;

  @JsonProperty("LIN_03_02")
  public String lIN_03_02;
}
