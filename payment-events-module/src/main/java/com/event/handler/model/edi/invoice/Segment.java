package com.event.handler.model.edi.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Segment {
  @JsonProperty("BGM_01")
  public String bGM_01;

  @JsonProperty("BGM_02")
  public String bGM_02;

  @JsonProperty("BGM_03")
  public String bGM_03;

  @JsonProperty("DTM_01")
  public DTM01 dTM_01;

  @JsonProperty("RFF_01")
  public RFF01 rFF_01;

  @JsonProperty("NAD_01")
  public String nAD_01;

  @JsonProperty("NAD_02")
  public NAD02 nAD_02;

  @JsonProperty("NAD_04")
  public String nAD_04;

  @JsonProperty("CUX_01")
  public CUX01 cUX_01;

  @JsonProperty("LIN_01")
  public String lIN_01;

  @JsonProperty("LIN_03")
  public LIN03 lIN_03;

  @JsonProperty("IMD_01")
  public String iMD_01;

  @JsonProperty("IMD_03")
  public IMD03 iMD_03;

  @JsonProperty("QTY_01")
  public QTY01 qTY_01;

  @JsonProperty("MOA_01")
  public MOA01 mOA_01;

  @JsonProperty("PRI_01")
  public PRI01 pRI_01;

  @JsonProperty("UNS_01")
  public String uNS_01;

  @JsonProperty("ALC_01")
  public String aLC_01;

  @JsonProperty("ALC_05")
  public String aLC_05;
}
