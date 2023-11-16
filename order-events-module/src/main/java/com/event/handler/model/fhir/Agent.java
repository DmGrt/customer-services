package com.event.handler.model.fhir;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@RequiredArgsConstructor
public class Agent {
  public ArrayList<Role> role;
  public Who who;
  public boolean requestor;
  public ArrayList<Extension> extension;
  public String networkString;
}
