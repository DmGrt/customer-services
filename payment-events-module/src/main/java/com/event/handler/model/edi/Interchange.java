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
public class Interchange {
  @JsonProperty("ISA_01_AuthorizationQualifier")
  public String iSA_01_AuthorizationQualifier;

  @JsonProperty("ISA_02_AuthorizationInformation")
  public String iSA_02_AuthorizationInformation;

  @JsonProperty("ISA_03_SecurityQualifier")
  public String iSA_03_SecurityQualifier;

  @JsonProperty("ISA_04_SecurityInformation")
  public String iSA_04_SecurityInformation;

  @JsonProperty("ISA_05_SenderQualifier")
  public String iSA_05_SenderQualifier;

  @JsonProperty("ISA_06_SenderId")
  public String iSA_06_SenderId;

  @JsonProperty("ISA_07_ReceiverQualifier")
  public String iSA_07_ReceiverQualifier;

  @JsonProperty("ISA_08_ReceiverId")
  public String iSA_08_ReceiverId;

  @JsonProperty("ISA_09_Date")
  public String iSA_09_Date;

  @JsonProperty("ISA_10_Time")
  public String iSA_10_Time;

  @JsonProperty("ISA_11_StandardsId")
  public String iSA_11_StandardsId;

  @JsonProperty("ISA_12_Version")
  public String iSA_12_Version;

  @JsonProperty("ISA_13_InterchangeControlNumber")
  public String iSA_13_InterchangeControlNumber;

  @JsonProperty("ISA_14_AcknowledgmentRequested")
  public String iSA_14_AcknowledgmentRequested;

  @JsonProperty("ISA_15_TestIndicator")
  public String iSA_15_TestIndicator;

  public ArrayList<FunctionalGroup> functional_groups;
}
