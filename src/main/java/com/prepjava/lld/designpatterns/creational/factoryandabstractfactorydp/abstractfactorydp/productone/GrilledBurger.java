package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone;

public class GrilledBurger implements BurgerI {

  @Override
  public void prepareBurger() {
    System.out.println("Grilled Burger is ready...");
  }

}
