package com.prepjava.core.synchronization.sharedData;

public class Client {
  public static void main(String[] args) {
    Count count = new Count();
    Adder adder = new Adder(count);
    Subtractor subtractor = new Subtractor(count);

    Thread t1 = new Thread(adder);
    Thread t2 = new Thread(subtractor);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Finished updating count object value: " + count.val);
  }
}
