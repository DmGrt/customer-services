package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder 
 @RequiredArgsConstructor
public class PRI01 {
  @JsonProperty("PRI_01_01")
  public String pRI_01_01;

  @JsonProperty("PRI_01_02")
  public String pRI_01_02;
}
