package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone;

public class PaneerTikiBurger implements BurgerI {

  @Override
  public void prepareBurger() {
    System.out.println("Paneer Tiki Burger is ready...");
  }
  
}
