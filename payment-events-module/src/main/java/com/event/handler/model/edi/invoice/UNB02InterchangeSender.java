package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder 
 @RequiredArgsConstructor
public class UNB02InterchangeSender {
  @JsonProperty("UNB_02_01_InterchangeSenderIdentification")
  public String uNB_02_01_InterchangeSenderIdentification;

  @JsonProperty("UNB_02_02_IdentificationCodeQualifier")
  public String uNB_02_02_IdentificationCodeQualifier;
}
