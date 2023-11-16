package com.event.handler.model.fhir.adverseevent;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seriousness {
  public ArrayList<Coding> coding;
}
