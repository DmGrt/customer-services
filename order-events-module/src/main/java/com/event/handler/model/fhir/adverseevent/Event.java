package com.event.handler.model.fhir.adverseevent;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Data
@Builder
@RequiredArgsConstructor
public class Event {
  public ArrayList<Coding> coding;
  public String text;
}
