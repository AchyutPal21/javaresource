package com.prepjava.core.semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

  private Queue<Shirt> store;
  private String consumerName;
  private Semaphore semaphoreProducer;
  private Semaphore semaphoreConsumer;

  public Consumer(Queue<Shirt> store, String consumerName, Semaphore semaphoreProducer,
      Semaphore semaphoreConsumer) {
    this.store = store;
    this.consumerName = consumerName;
    this.semaphoreProducer = semaphoreProducer;
    this.semaphoreConsumer = semaphoreConsumer;
  }

  @Override
  public void run() {
    // while (true) {
    // if (this.store.size() > 0) {
    // Shirt shirt = store.poll();
    // System.out.println("CONSUMER =>" + this.consumerName + " consume item <" +
    // shirt.name + "> by " + Thread.currentThread().getName());
    // }
    // }

    while (true) {
      try {
        semaphoreConsumer.acquire(); // <--- Consumer

        Shirt shirt = store.poll();
        System.out.println("CONSUMER =>" + this.consumerName + " consume item <" + shirt.name + "> from store items: "
            + this.store.size() + " by " + Thread.currentThread().getName());

        semaphoreProducer.release(); // <--- Producer
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
