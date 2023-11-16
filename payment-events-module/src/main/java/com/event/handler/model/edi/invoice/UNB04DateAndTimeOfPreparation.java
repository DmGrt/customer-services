package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class UNB04DateAndTimeOfPreparation {
  @JsonProperty("UNB_04_01_Date")
  public String uNB_04_01_Date;

  @JsonProperty("UNB_04_02_Time")
  public String uNB_04_02_Time;
}
