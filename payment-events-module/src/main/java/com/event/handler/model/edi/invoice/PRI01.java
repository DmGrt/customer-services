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
public class PRI01 {
  @JsonProperty("PRI_01_01")
  public String pRI_01_01;

  @JsonProperty("PRI_01_02")
  public String pRI_01_02;
}
