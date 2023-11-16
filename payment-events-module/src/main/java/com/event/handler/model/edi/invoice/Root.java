package com.event.handler.model.edi.invoice;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Root {
  public ArrayList<Interchange> interchanges;
}
