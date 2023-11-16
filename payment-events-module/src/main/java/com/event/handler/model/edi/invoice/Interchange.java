package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Interchange {
  @JsonProperty("UNB_01_SyntaxIdentifier")
  public UNB01SyntaxIdentifier uNB_01_SyntaxIdentifier;

  @JsonProperty("UNB_02_InterchangeSender")
  public UNB02InterchangeSender uNB_02_InterchangeSender;

  @JsonProperty("UNB_03_InterchangeReceiver")
  public UNB03InterchangeReceiver uNB_03_InterchangeReceiver;

  @JsonProperty("UNB_04_DateAndTimeOfPreparation")
  public UNB04DateAndTimeOfPreparation uNB_04_DateAndTimeOfPreparation;

  @JsonProperty("UNB_05_InterchangeControlReference")
  public String uNB_05_InterchangeControlReference;

  public ArrayList<Transaction> transactions;
}
