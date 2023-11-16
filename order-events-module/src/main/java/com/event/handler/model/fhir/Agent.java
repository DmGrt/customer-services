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
public class Agent {
  public ArrayList<Role> role;
  public Who who;
  public boolean requestor;
  public ArrayList<Extension> extension;
  public String networkString;
}
