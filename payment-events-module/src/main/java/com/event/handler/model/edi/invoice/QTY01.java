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
public class QTY01 {
  @JsonProperty("QTY_01_01")
  public String qTY_01_01;

  @JsonProperty("QTY_01_02")
  public String qTY_01_02;

  @JsonProperty("QTY_01_03")
  public String qTY_01_03;
}
