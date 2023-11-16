package com.event.handler.model.fhir.adverseevent;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Data
@Builder
@RequiredArgsConstructor
public class Category {
  public ArrayList<Coding> coding;
}
