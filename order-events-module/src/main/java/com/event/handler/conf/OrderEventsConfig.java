package com.event.handler.conf;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@Configuration
public class OrderEventsConfig {
  @Bean
  public PodamFactory podamFactory() {
    PodamFactoryImpl podamFactory = new PodamFactoryImpl();
    podamFactory.getStrategy().setDefaultNumberOfCollectionElements(1);
    return podamFactory;
  }

  @Bean
  public Gson gson() {
    return new Gson();
  }
}
