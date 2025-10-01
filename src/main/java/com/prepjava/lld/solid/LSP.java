package com.prepjava.lld.solid;

// Liskov Substitution Principle says If class B is a 
// subclass of class A, then objects of A should be 
// replaceable with objects of B without breaking 
// the program’s correctness.

// Base class
class Bird {
  public void fly() {
    System.out.println("This bird can fly!");
  }
}

// Subclass: Ostrich (Problematic!)
class Ostrich extends Bird {
  @Override
  public void fly() {
    throw new UnsupportedOperationException("Ostriches cannot fly!");
  }
}

class LSPViolationExample {
  public static void main(String[] args) {
    Bird bird = new Ostrich(); // Upcasting

    // ❌ Violates LSP - runtime exception
    bird.fly();
  }
}

public class LSP {

  /*
   * Why violates LSP,
   * Bird promises fly() works. But Ostrich breaks that promise (throws
   * exception). Code that relies on Bird.fly() no longer works correctly.
   * ------------------------------------------------------------
   * We should rethink the class hierarchy. Flying is not a property of all birds.
   * So, instead of forcing Ostrich to implement fly(), we extract an interface.
   * 
   */
}

interface Flyable {
  void fly();
}

class BirdNew {
  public void eat() {
    System.out.println("This bird eats food.");
  }
}

class Sparrow extends BirdNew implements Flyable {
  public void fly() {
    System.out.println("Sparrow is flying!");
  }
}

class OstrichNew extends BirdNew {
  // Ostrich doesn’t implement Flyable
}

class FixedLSPExample {
  public static void main(String[] args) {
    BirdNew sparrow = new Sparrow();
    BirdNew ostrich = new OstrichNew();

    sparrow.eat();
    ostrich.eat();

    Flyable flyer = new Sparrow();
    flyer.fly(); // ✅ Works fine

    // Ostrich is not Flyable, so no broken behavior
  }
}
