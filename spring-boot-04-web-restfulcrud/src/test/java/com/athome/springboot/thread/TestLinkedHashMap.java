package com.athome.springboot.thread;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 测试linkedhashmap的removeEldestEntry方法，
 * 重写该方法可以实现在一个集合中始终保存最新的n个键值对
 */
public class TestLinkedHashMap extends LinkedHashMap {
  public static void main(String[] args) {
    FixSizeLinkedTest fixSizeLinkedTest = new FixSizeLinkedTest();
    System.out.println(fixSizeLinkedTest.size());


    for (int i = 0; i < 50; i++) {
      fixSizeLinkedTest.put(i, i);
      System.out.println(fixSizeLinkedTest.size());
      System.out.println(fixSizeLinkedTest);
    }
  }

  static class FixSizeLinkedTest extends LinkedHashMap {
    private static final long serialVersion = 567890987678L;
    private static int MAX_SIZE = 10;


    /**
     * put值时会自动调用此方法，若超出指定大小则删除最先存储的值，保证集合里是最新的值
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
      return size() > MAX_SIZE;
    }
  }
}