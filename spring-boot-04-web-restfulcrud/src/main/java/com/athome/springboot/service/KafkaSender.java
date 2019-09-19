/*
package com.athome.springboot.service;

import com.athome.springboot.domain.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class KafkaSender {

  private final org.slf4j.Logger log = LoggerFactory.getLogger(getClass());

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  private Gson gson = new GsonBuilder().create();

  public void send() {
    Message message = new Message();
    message.setId(ThreadLocalRandom.current().nextLong());
    message.setMsg(Thread.currentThread().getName());
    message.setSendTime(LocalDate.now());
    log.info("message = {}", message);
    kafkaTemplate.send("first" ,gson.toJson(message));
  }


}
*/
