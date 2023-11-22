package com.event.handler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class PaymentEventsProxy {
  public static void main(String[] args) {
    SpringApplication.run(PaymentEventsProxy.class);
  }
}
