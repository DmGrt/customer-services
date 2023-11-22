package com.event.handler.model.fhir.adverseevent;

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
public class Adverseevent {
  public String type;
  public String resourceType;
  public String id;
  public Text text;
  public Identifier identifier;
  public String actuality;
  public ArrayList<Category> category;
  public Event event;
  public Subject subject;
  public Date date;
  public Seriousness seriousness;
  public Severity severity;
  public Recorder recorder;
  public ArrayList<SuspectEntity> suspectEntity;
}
