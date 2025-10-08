package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product;

public class CheeseBurger implements BurgerI {

  @Override
  public void prepareBurger() {
    System.out.println("Cheese Burger is ready...");
  }

}
