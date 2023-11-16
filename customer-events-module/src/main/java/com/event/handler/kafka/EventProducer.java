package com.event.handler.kafka;

import com.event.handler.model.cem.CustomerEventModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import uk.co.jemos.podam.api.PodamFactory;

@Slf4j
@Component
@RequiredArgsConstructor
public class EventProducer {

  private static final String TOPIC = "event-handler-2";

  private final KafkaTemplate<String, String> kafkaTemplate;
  private final PodamFactory podam;
  private final Gson gson;

  void sendMessage(String message, String topicName) {
    kafkaTemplate.send(topicName, message);
  }

  public void sendCustomerEvent() {
    List<CustomerEventModel> customerEventModels = new ArrayList<>();
    for (int i = 0; i <= 10; i++) {
      customerEventModels.add(podam.manufacturePojo(CustomerEventModel.class));
    }
    String json = gson.toJson(customerEventModels);
    log.info(String.format("#### -> Sending Customer Events message -> %s", json));
    kafkaTemplate.send(TOPIC, json);
  }

  void sendMessageWithCallback(String message) {
    CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(TOPIC, message);

    future.thenApply(r -> r + " supplied successfully");
  }
}
