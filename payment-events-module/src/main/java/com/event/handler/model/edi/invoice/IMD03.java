package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder 
 @RequiredArgsConstructor
public class IMD03 {
  @JsonProperty("IMD_03_04")
  public String iMD_03_04;
}
