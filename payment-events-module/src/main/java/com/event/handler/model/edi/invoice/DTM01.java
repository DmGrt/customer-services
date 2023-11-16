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
public class DTM01 {
  @JsonProperty("DTM_01_01")
  public String dTM_01_01;

  @JsonProperty("DTM_01_02")
  public String dTM_01_02;

  @JsonProperty("DTM_01_03")
  public String dTM_01_03;
}
