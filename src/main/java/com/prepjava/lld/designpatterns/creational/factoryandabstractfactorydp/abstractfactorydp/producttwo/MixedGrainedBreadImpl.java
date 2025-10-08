package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo;

public class MixedGrainedBreadImpl implements BreadI {

  @Override
  public void prepareBread() {
    System.out.println("Mixed-grained bread is preparing in oven...");
  }

}
