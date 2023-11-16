package com.event.handler.model.fhir;

import java.util.ArrayList;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class FHIREvent {
  public String resourceType;
  public String id;
  public Text text;
  public ArrayList<Category> category;
  public Code code;
  public String action;
  public Date recorded;
  public Outcome outcome;
  public ArrayList<Agent> agent;
  public Source source;
  public ArrayList<Entity> entity;
}
