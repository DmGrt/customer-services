package com.event.handler.model.edi;

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
