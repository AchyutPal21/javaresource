package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone;

public class CheeseBurger implements BurgerI {

  @Override
  public void prepareBurger() {
    System.out.println("Cheese Burger is ready...");
  }

}
