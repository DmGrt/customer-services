package com.event.handler.model.fhir;

import java.util.ArrayList;

@Data
@Builder
@RequiredArgsConstructor
public class Type {
  public String text;
  public ArrayList<Coding> coding;
}
