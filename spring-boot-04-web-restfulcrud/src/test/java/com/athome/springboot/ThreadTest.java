package com.athome.springboot;

public class ThreadTest {
  public static void main(String[] args) throws InterruptedException {
    ThreadDemo td = new ThreadDemo();
    new Thread(td).start();
    /**
     * while (true) 执行调用底层  速度非常快 没有时间再次从主内存中获取数据到自己内存
     */
    while (true) {
      if (td.flag) {
        System.out.println("===========");
        break;
      }
    }
  }
}

class ThreadDemo implements Runnable{


  volatile boolean flag = false;
  @Override
  public void run() {
    try {
      Thread.sleep(0);
      flag = true;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(flag);
  }
}
