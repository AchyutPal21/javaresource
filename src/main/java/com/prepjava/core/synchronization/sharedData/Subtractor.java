package com.prepjava.core.synchronization.sharedData;

public class Subtractor implements Runnable {
  private Count count;

  public Subtractor(Count count) {
    this.count = count;
  }

  @Override
  public void run() {
    for (int i = 0; i <= 10000000; i++) {
      this.count.val -= 1;
    }
  }
}
