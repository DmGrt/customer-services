package com.event.handler.model.edi.invoice;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Data
@Builder 
 @RequiredArgsConstructor
public class Root {
  public ArrayList<Interchange> interchanges;
}
