package com.event.handler.model.fhir;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@RequiredArgsConstructor
public class Source {
  public Observer observer;
  public ArrayList<Type> type;
}
