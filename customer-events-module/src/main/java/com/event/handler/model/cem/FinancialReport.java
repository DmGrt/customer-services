package com.event.handler.model.cem;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class FinancialReport {
  public String label;
  public String date;
  public String url;
}
