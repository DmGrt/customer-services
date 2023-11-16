package com.event.handler.model.fhir;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Role {
  public String text;
  public ArrayList<Coding> coding;
}
