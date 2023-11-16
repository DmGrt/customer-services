package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder 
 @RequiredArgsConstructor
public class UNB03InterchangeReceiver {
  @JsonProperty("UNB_03_01_InterchangeReceiverIdentification")
  public String uNB_03_01_InterchangeReceiverIdentification;

  @JsonProperty("UNB_03_02_IdentificationCodeQualifier")
  public String uNB_03_02_IdentificationCodeQualifier;
}
