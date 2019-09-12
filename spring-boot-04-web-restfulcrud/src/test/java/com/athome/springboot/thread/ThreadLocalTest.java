package com.athome.springboot.thread;

import org.junit.Test;

/**
 *ThreadLocal
 */
public class ThreadLocalTest {

  // 创建threadlocal
  static ThreadLocal<Object> threadLocal = new ThreadLocal<>();

  public static void main(String[] args) {


    Thread threadOne = new Thread(() -> {
      threadLocal.set("threadOne first set value");
      print("threadOne");
      System.out.println(threadLocal.get());
    });

    Thread threadTwo = new Thread(() -> {
        threadLocal.set("threadTwo first set value");
        print("threadTwo");
        System.out.println(threadLocal.get());
    });

    threadOne.start();
    threadTwo.start();
  }



  static void print(String str) {
    System.out.println(str + ":" + threadLocal.get());
    // 清除当前线程本地内存的变量
    threadLocal.remove();
  }


  @Test
  public void t() {
    String str = "9";

  }
}
