package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder 
 @RequiredArgsConstructor
public class UNB01SyntaxIdentifier {
  @JsonProperty("UNB_01_01_SyntaxIdentifier")
  public String uNB_01_01_SyntaxIdentifier;

  @JsonProperty("UNB_01_02_SyntaxVersionNumber")
  public String uNB_01_02_SyntaxVersionNumber;
}
