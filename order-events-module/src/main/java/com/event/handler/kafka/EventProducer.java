package com.event.handler.kafka;

import com.event.handler.model.fhir.FHIREvent;
import com.event.handler.model.fhir.adverseevent.Adverseevent;
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

  private static final String TOPIC = "eventHandler1";

  private final KafkaTemplate<String, String> kafkaTemplate;
  private final PodamFactory podam;
  private final Gson gson;

  void sendMessage(String message, String topicName) {
    kafkaTemplate.send(topicName, message);
  }

  public void sendFhir() {
    List<FHIREvent> fhirs = new ArrayList<>();
    for (int i = 0; i <= 2; i++) {
      FHIREvent fhirEvent = podam.manufacturePojo(FHIREvent.class);
      fhirEvent.setType("FHIR");
      fhirs.add(fhirEvent);
    }
    String json = gson.toJson(fhirs);
    log.info(String.format("#### -> Sending FHIR order event message -> %s", json));
    kafkaTemplate.send(TOPIC, json);
  }

  public void sendAdverseevent() {
    List<Adverseevent> adverseevents = new ArrayList<>();
    for (int i = 0; i <= 2; i++) {
      Adverseevent adverseevent = podam.manufacturePojo(Adverseevent.class);
      adverseevent.setType("Adverseevent");
      adverseevents.add(adverseevent);
    }
    String json = gson.toJson(adverseevents);
    log.info("#### -> Sending Adverseevent event message ->");
    kafkaTemplate.send(TOPIC, json);
  }

  void sendMessageWithCallback(String message) {
    CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(TOPIC, message);

    future.thenApply(r -> r + " supplied successfully");
  }
}
