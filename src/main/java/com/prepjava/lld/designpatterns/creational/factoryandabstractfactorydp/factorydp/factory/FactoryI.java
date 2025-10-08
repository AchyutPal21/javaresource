package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.factory;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.BurgerI;

public interface FactoryI {
  BurgerI createBurger(String burgerName);
}
