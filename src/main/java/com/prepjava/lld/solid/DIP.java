package com.prepjava.lld.solid;

// Dependency Inversion Principle says,

// High-level modules should not depend on low-level modules. 
// Both should depend on abstractions. Abstractions should not 
// depend on details. Details should depend on abstractions.
// This means: Your business logic (high-level) should not 
// directly depend on implementation classes (low-level). 
// Instead, both should depend on interfaces or abstract classes (abstractions).
// The actual implementation can be swapped without changing the high-level logic.

// Low-level module (concrete implementation)
class CreditCardPayment {
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Credit Card");
  }
}

// High-level module (depends directly on low-level module)
class ShoppingCart {
  private CreditCardPayment payment = new CreditCardPayment(); // ❌ tightly coupled

  public void checkout(double amount) {
    payment.pay(amount); // directly depends on CreditCardPayment
  }
}

// Main
class Client {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.checkout(500.0); // Works only with CreditCardPayment
  }
}

public class DIP {

  /*
   * If tomorrow you need to add PayPal or UPI payment, you must modify
   * ShoppingCart.
   * ShoppingCart is tightly coupled to CreditCardPayment.
   * Not extensible → violates Open-Closed Principle too.
   * ------------------------------------------------------------
   * ShoppingCart doesn’t care about the actual payment method.
   * New payment methods can be added without modifying ShoppingCart.
   * Promotes loose coupling and extensibility.
   * 
   */
}

// Abstraction (Interface)
interface PaymentMethod {
  void pay(double amount);
}

// Low-level modules (concrete implementations)
class CreditCardPaymentNew implements PaymentMethod {
  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Credit Card");
  }
}

class PayPalPayment implements PaymentMethod {
  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using PayPal");
  }
}

class UpiPayment implements PaymentMethod {
  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using UPI");
  }
}

// High-level module (depends on abstraction)
class ShoppingCartNew {
  private PaymentMethod paymentMethod; // ✅ depends on abstraction

  public ShoppingCartNew(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod; // injected
  }

  public void checkout(double amount) {
    paymentMethod.pay(amount);
  }
}

// Main
class ClientNew {
  public static void main(String[] args) {
    // Injecting dependency (can switch anytime)
    ShoppingCartNew cart1 = new ShoppingCartNew(new CreditCardPaymentNew());
    cart1.checkout(500.0);

    ShoppingCartNew cart2 = new ShoppingCartNew(new PayPalPayment());
    cart2.checkout(300.0);

    ShoppingCartNew cart3 = new ShoppingCartNew(new UpiPayment());
    cart3.checkout(200.0);
  }
}
