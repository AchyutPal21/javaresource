package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product;

public class VegBurger implements BurgerI {

  @Override
  public void prepareBurger() {
    System.out.println("Veg Burger is ready...");
  }

}
