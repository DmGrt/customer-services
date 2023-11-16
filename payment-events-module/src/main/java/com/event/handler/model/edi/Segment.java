package com.event.handler.model.edi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder 
 @RequiredArgsConstructor
public class Segment{
    @JsonProperty("BGN_01")
    public String bGN_01;
    @JsonProperty("BGN_02")
    public String bGN_02;
    @JsonProperty("BGN_03")
    public String bGN_03;
    @JsonProperty("BGN_04")
    public String bGN_04;
    @JsonProperty("BGN_06")
    public String bGN_06;
    @JsonProperty("BGN_08")
    public String bGN_08;
    @JsonProperty("N1_01")
    public String n1_01;
    @JsonProperty("N1_02")
    public String n1_02;
    @JsonProperty("N1_03")
    public String n1_03;
    @JsonProperty("N1_04")
    public String n1_04;
    @JsonProperty("PER_01")
    public String pER_01;
    @JsonProperty("PER_02")
    public String pER_02;
    @JsonProperty("PER_03")
    public String pER_03;
    @JsonProperty("PER_04")
    public String pER_04;
    @JsonProperty("PER_05")
    public String pER_05;
    @JsonProperty("PER_06")
    public String pER_06;
    @JsonProperty("OTI_01")
    public String oTI_01;
    @JsonProperty("OTI_02")
    public String oTI_02;
    @JsonProperty("OTI_03")
    public String oTI_03;
    @JsonProperty("OTI_06")
    public String oTI_06;
    @JsonProperty("OTI_07")
    public String oTI_07;
    @JsonProperty("OTI_08")
    public String oTI_08;
    @JsonProperty("OTI_09")
    public String oTI_09;
    @JsonProperty("OTI_10")
    public String oTI_10;
    @JsonProperty("OTI_11")
    public String oTI_11;
}