package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone;

public class PeriPeriBurger implements BurgerI {

  @Override
  public void prepareBurger() {
    System.out.println("Peri Peri Burger is ready...");
  }

}
