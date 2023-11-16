package com.event.handler.model.fhir;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Code {
  public ArrayList<Coding> coding;
  public String system;
  public String code;
  public String display;
}
