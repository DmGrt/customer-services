package com.event.handler.model.fhir;

import java.util.ArrayList;

public class Agent {
  public ArrayList<Role> role;
  public Who who;
  public boolean requestor;
  public ArrayList<Extension> extension;
  public String networkString;
}
