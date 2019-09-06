package com.athome.springboot;

import java.util.concurrent.*;

public class CallableTest {

  private static ExecutorService executor = Executors.newFixedThreadPool(64);

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CallableTest ct = new CallableTest();
    Object test = ct.test();
    System.out.println("-----" + test);
  }

  public Object test() throws ExecutionException, InterruptedException {


    Future<Object> result = executor.submit(new CallableDemo(20));
    Object o = result.get();
    executor.shutdown();
    return o;
  }
}

class CallableDemo implements Callable<Object> {
  private Integer i = 10;

  public CallableDemo(Integer i) {
   this.i = i;
  }

  @Override
  public Object call() throws Exception {
    int j = this.i + 800;
    return j;
  }
}
