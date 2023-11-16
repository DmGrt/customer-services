package com.event.handler.kafka;

import com.event.handler.model.edi.Interchange;
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

  private static final String TOPIC = "event-handler-1";

  private final KafkaTemplate<String, String> kafkaTemplate;
  private final PodamFactory podam;
  private final Gson gson;
  private List<String> receiversIds = new ArrayList<>();

  void sendMessage(String message, String topicName) {
    kafkaTemplate.send(topicName, message);
  }

  public void sendEdi() {
    List<Interchange> interchanges = new ArrayList<>();
    for (int i = 0; i <= 10; i++) {
      interchanges.add(podam.manufacturePojo(Interchange.class));
    }
    receiversIds = interchanges.stream().map(Interchange::getISA_08_ReceiverId).toList();
    String json = gson.toJson(interchanges);
    log.info(String.format("#### -> Sending edi event message -> %s", json));
    kafkaTemplate.send(TOPIC, json);
  }

  public void sendInvoice() {
    List<com.event.handler.model.edi.invoice.Interchange> interchanges = new ArrayList<>();
    for (int i = 0; i <= 10; i++) {
      com.event.handler.model.edi.invoice.Interchange interchange =
          podam.manufacturePojo(com.event.handler.model.edi.invoice.Interchange.class);
      interchange
          .getUNB_03_InterchangeReceiver()
          .setUNB_03_01_InterchangeReceiverIdentification(receiversIds.get(i));
      interchanges.add(interchange);
    }
    String json = gson.toJson(interchanges);
    log.info(String.format("#### -> Sending edi invoice event message -> %s", json));
    kafkaTemplate.send(TOPIC, json);
  }

  void sendMessageWithCallback(String message) {
    CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(TOPIC, message);

    future.thenApply(r -> r + " supplied successfully");
  }
}
