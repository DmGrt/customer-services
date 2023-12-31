package com.event.handler.model.edi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
  @JsonProperty("ST_01_TransactionSetIdentifierCode")
  public String sT_01_TransactionSetIdentifierCode;

  @JsonProperty("ST_02_TransactionSetControlNumber")
  public String sT_02_TransactionSetControlNumber;

  @JsonProperty("ST_03_ImplementationConventionReference")
  public String sT_03_ImplementationConventionReference;

  public ArrayList<Segment> segments;
}
