package com.athome.springboot.thread;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadDemo {

  public static void main(String[] args) throws InterruptedException {
    Thread threadOne = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("ThreadA exec...");
        try {
          Thread.sleep(2000000);
        } catch (InterruptedException e) {
          e.printStackTrace();
          System.out.println("ThreadOne is interrupter while sleeping");
          //return;
        }
        System.out.println("ThreadOne is living normal");
      }
    });

    // 启动子线程
    threadOne.start();

    // 为确保子线程进入休眠，主线程休眠一秒等待
    Thread.sleep(1000);

    // 中断子线程 让其从sleep函数中返回
    threadOne.interrupt();

    // 等待子线程执行完毕
    threadOne.join();

    System.out.println("Main thread is over ...");

  }

  @Test
  public void testFor() throws InterruptedException {

    ThreadLocalRandom current = ThreadLocalRandom.current();
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {

        for (;;) {
          System.out.println(current.nextInt(1000));
          List<Object> objects = Collections.emptyList();
          LinkedHashMap linkedHashMap = new LinkedHashMap();

        }
      }
    });

    //thread.setDaemon(true);
    thread.start();

    Thread.sleep(1000);
    System.out.println("main over");
//    thread.interrupt();
//
//    // 中断函数是针对当前线程 不是调用的线程 下面这个函数代表的是主线程调用的isInterrupted
//    System.out.println(thread.isInterrupted());
//
//    //System.out.println(thread.interrupted());
//
//    System.out.println(thread.isInterrupted());


  }

}
