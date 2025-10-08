package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo;

public class GarlicBreadImpl implements BreadI {

  @Override
  public void prepareBread() {
    System.out.println("Garlic Bread is preparing in oven...");
  }

}
