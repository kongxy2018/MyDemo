package com.athome.springboot;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Account {

  private BigDecimal balance;
  private BigDecimal sub_balance;


  public Account() {}

  public Account(BigDecimal balance, BigDecimal sub_balance) {
    this.balance = balance;
    this.sub_balance = sub_balance;
  }

}
