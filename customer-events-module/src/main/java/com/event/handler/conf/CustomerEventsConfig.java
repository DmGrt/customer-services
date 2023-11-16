package com.event.handler.conf;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@Configuration
public class CustomerEventsConfig {
  @Bean
  public PodamFactory podamFactory() {
    return new PodamFactoryImpl();
  }

  @Bean
  public Gson gson() {
    return new Gson();
  }
}
