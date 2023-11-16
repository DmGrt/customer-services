package com.event.handler.model.cem;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class Sandbox {
  public String status;
  public String sourceUrl;
}
