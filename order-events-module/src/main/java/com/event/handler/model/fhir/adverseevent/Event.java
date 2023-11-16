package com.event.handler.model.fhir.adverseevent;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Event {
  public ArrayList<Coding> coding;
  public String text;
}
