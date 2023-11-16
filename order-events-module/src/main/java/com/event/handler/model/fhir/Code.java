package com.event.handler.model.fhir;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@RequiredArgsConstructor
public class Code {
  public ArrayList<Coding> coding;
  public String system;
  public String code;
  public String display;
}
