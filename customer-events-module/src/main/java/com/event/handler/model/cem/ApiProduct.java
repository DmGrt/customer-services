package com.event.handler.model.cem;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class ApiProduct {
  public String label;
  public String type;
  public ArrayList<String> categories;
  public String description;
  public String documentationUrl;
  public String apiReferenceUrl;
  public boolean premium;
  public String stage;
  public String specification;
  public ArrayList<String> countries;
}
