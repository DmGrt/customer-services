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
public class MOA01 {
  @JsonProperty("MOA_01_01")
  public String mOA_01_01;

  @JsonProperty("MOA_01_02")
  public String mOA_01_02;
}
