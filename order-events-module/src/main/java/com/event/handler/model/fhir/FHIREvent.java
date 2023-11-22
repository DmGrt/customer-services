package com.event.handler.model.fhir;

import java.util.ArrayList;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FHIREvent {
  public String type;
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
