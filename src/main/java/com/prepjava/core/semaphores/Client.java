package com.prepjava.core.semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
  public static void main(String[] args) {
    Queue<Shirt> store = new ConcurrentLinkedQueue<>();
    int storeSize = 5;
    Semaphore semaphoreProducer = new Semaphore(storeSize);
    Semaphore semaphoreConsumer = new Semaphore(0);

    Producer p1 = new Producer(storeSize, store, "P1", semaphoreProducer, semaphoreConsumer);
    Producer p2 = new Producer(storeSize, store, "P2", semaphoreProducer, semaphoreConsumer);
    Producer p3 = new Producer(storeSize, store, "P3", semaphoreProducer, semaphoreConsumer);
    Producer p4 = new Producer(storeSize, store, "P4", semaphoreProducer, semaphoreConsumer);
    Producer p5 = new Producer(storeSize, store, "P5", semaphoreProducer, semaphoreConsumer);

    Consumer c1 = new Consumer(store, "C1", semaphoreProducer, semaphoreConsumer);
    Consumer c2 = new Consumer(store, "C2", semaphoreProducer, semaphoreConsumer);
    Consumer c3 = new Consumer(store, "C3", semaphoreProducer, semaphoreConsumer);
    Consumer c4 = new Consumer(store, "C4", semaphoreProducer, semaphoreConsumer);
    Consumer c5 = new Consumer(store, "C5", semaphoreProducer, semaphoreConsumer);

    Thread pt1 = new Thread(p1);
    Thread pt2 = new Thread(p2);
    Thread pt3 = new Thread(p3);
    Thread pt4 = new Thread(p4);
    Thread pt5 = new Thread(p5);

    Thread ct1 = new Thread(c1);
    Thread ct2 = new Thread(c2);
    Thread ct3 = new Thread(c3);
    Thread ct4 = new Thread(c4);
    Thread ct5 = new Thread(c5);

    pt1.start();
    pt2.start();
    pt3.start();
    pt4.start();
    pt5.start();

    ct1.start();
    ct2.start();
    ct3.start();
    ct4.start();
    ct5.start();

    try {
      pt1.join();
      pt2.join();
      pt3.join();
      pt4.join();
      pt5.join();

      ct1.join();
      ct2.join();
      ct3.join();
      ct4.join();
      ct5.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


  }
}
