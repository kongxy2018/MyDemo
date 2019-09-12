package com.athome.springboot.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaReceiver {
  private final org.slf4j.Logger log = LoggerFactory.getLogger(getClass());

  @KafkaListener(topics = {"first"})
  public void listen(ConsumerRecord<?, ?> record) {
    Optional<?> value = Optional.ofNullable(record.value());
    if (value.isPresent()) {
      Object o = value.get();
      log.info("message : " + o);
      log.info("record : " + record);
    }
  }
}
