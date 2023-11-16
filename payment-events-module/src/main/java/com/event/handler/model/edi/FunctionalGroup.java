package com.event.handler.model.edi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class FunctionalGroup {
  @JsonProperty("GS_01_FunctionalIdentifierCode")
  public String gS_01_FunctionalIdentifierCode;

  @JsonProperty("GS_02_ApplicationSenderCode")
  public String gS_02_ApplicationSenderCode;

  @JsonProperty("GS_03_ApplicationReceiverCode")
  public String gS_03_ApplicationReceiverCode;

  @JsonProperty("GS_04_Date")
  public String gS_04_Date;

  @JsonProperty("GS_05_Time")
  public String gS_05_Time;

  @JsonProperty("GS_06_GroupControlNumber")
  public String gS_06_GroupControlNumber;

  @JsonProperty("GS_07_ResponsibleAgencyCode")
  public String gS_07_ResponsibleAgencyCode;

  @JsonProperty("GS_08_Version")
  public String gS_08_Version;

  public ArrayList<Transaction> transactions;
}
