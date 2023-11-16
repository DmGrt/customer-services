package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class UNH02MessageIdentifier {
  @JsonProperty("UNH_02_01_MessageType")
  public String uNH_02_01_MessageType;

  @JsonProperty("UNH_02_02_MessageVersionNumber")
  public String uNH_02_02_MessageVersionNumber;

  @JsonProperty("UNH_02_03_MessageReleaseNumber")
  public String uNH_02_03_MessageReleaseNumber;

  @JsonProperty("UNH_02_04_ControllingAgency")
  public String uNH_02_04_ControllingAgency;
}
