package com.prepjava.core.semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  private int storeSize;
  private Queue<Shirt> store;
  private String producerName;
  private Semaphore semaphoreProducer;
  private Semaphore semaphoreConsumer;

  public Producer(int storeSize, Queue<Shirt> store, String producerName, Semaphore semaphoreProducer,
      Semaphore semaphoreConsumer) {
    this.storeSize = storeSize;
    this.store = store;
    this.producerName = producerName;
    this.semaphoreProducer = semaphoreProducer;
    this.semaphoreConsumer = semaphoreConsumer;
  }

  @Override
  public void run() {
    // while (true) {
    // if (this.store.size() < this.storeSize) {
    // Shirt shirt = new Shirt(4);
    // this.store.add(shirt);
    // System.out.println("PRODUCER =>" + this.producerName + " produced item <" +
    // shirt.name + "> by "
    // + Thread.currentThread().getName());
    // }
    // }
    while (true) {
      try {
        this.semaphoreProducer.acquire(); // <--- Producer

        Shirt shirt = new Shirt(4);
        this.store.add(shirt);
        System.out.println("PRODUCER =>" + this.producerName + " produced item <" + shirt.name +
            "> of " + this.store.size() + "/" + this.storeSize + " by "
            + Thread.currentThread().getName());

        this.semaphoreConsumer.release(); // <--- Consumer
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
