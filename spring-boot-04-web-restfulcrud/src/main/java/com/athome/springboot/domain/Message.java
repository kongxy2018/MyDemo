package com.athome.springboot.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Message {
  private Long id;
  private String msg;
  private LocalDate sendTime;
}
