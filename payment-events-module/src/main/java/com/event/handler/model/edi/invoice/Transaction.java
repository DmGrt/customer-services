package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Data
@Builder 
 @RequiredArgsConstructor
public class Transaction {
  @JsonProperty("UNH_01_MessageReferenceNumber")
  public String uNH_01_MessageReferenceNumber;

  @JsonProperty("UNH_02_MessageIdentifier")
  public UNH02MessageIdentifier uNH_02_MessageIdentifier;

  public ArrayList<Segment> segments;
}
