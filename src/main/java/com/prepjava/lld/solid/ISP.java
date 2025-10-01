package com.prepjava.lld.solid;

// Interface Segregation Principle says, No client should be forced to depend on methods it does not use.
// Instead of having one big “fat” interface, split it into smaller, more specific interfaces.

interface Worker {
  void work();

  void eat(); // 🚨 not all workers eat
}

class HumanWorker implements Worker {
  public void work() {
    System.out.println("Human is working...");
  }

  public void eat() {
    System.out.println("Human is eating...");
  }
}

class RobotWorker implements Worker {
  public void work() {
    System.out.println("Robot is working...");
  }

  public void eat() {
    // 🚨 Robot doesn’t eat but is forced to implement eat()
    throw new UnsupportedOperationException("Robot cannot eat!");
  }
}

public class ISP {
  /*
   * RobotWorker is forced to implement eat() it doesn’t need.
   * Breaks ISP: clients depending on Worker expect both work()
   * and eat(), but not all workers support that.
   * 
   * -----------------------------------------------
   * 
   * HumanWorker implements both Workable and Eatable.
   * RobotWorker implements only Workable.
   * Clients that only care about working depend only on Workable, not on unnecessary eat() methods.
   * 👉 This way, interfaces are smaller, more specific, and clients only depend on what they use.
   * 
   * 
   */
}

interface Workable {
  void work();
}

interface Eatable {
  void eat();
}

class HumanWorkerNew implements Workable, Eatable {
  public void work() {
    System.out.println("Human is working...");
  }

  public void eat() {
    System.out.println("Human is eating...");
  }
}

class RobotWorkerNew implements Workable {
  public void work() {
    System.out.println("Robot is working...");
  }
}
