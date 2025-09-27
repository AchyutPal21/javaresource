package com.prepjava.core.synchronization.impleSync;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

  private Count count;
  private Lock lock;

  public Adder(Count count, Lock lock) {
    this.count = count;
    this.lock = lock;
  }

  @Override
  public void run() {
    for (int i = 0; i <= 10000000; i++) {
      // synchronized (this.count) {
      //   this.count.val += 1; // => This is the critical section
      // }
      lock.lock();
      this.count.val += 1;
      lock.unlock();
    }
  }

}
