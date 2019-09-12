package com.athome.springboot;

import org.assertj.core.util.Lists;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class J8test {

  public static void main(String[] args) {
    Account account = new Account(new BigDecimal(12), new BigDecimal(10));

    Account account1 = new Account(new BigDecimal(22), new BigDecimal(33));

    Account account2 = new Account(new BigDecimal(1), new BigDecimal(2));

    ArrayList<Account> list =
            Lists.newArrayList();

    ArrayList<Account> list1 = Lists.newArrayList();
    list1.add(account2);

    list.add(account);
    list.add(account1);


    List<String> str =
            Arrays.asList("aa", "bb", "BB", "aa", "ff", "ff", "ff", "t");


    Map<String, Long> collect = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(collect);

    List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

    System.out.println("筛选列表: " + filtered);
    String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(""));
    System.out.println("合并字符串: " + mergedString);
  }
}
