package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.factory;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.BurgerI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.BreadI;

public interface FactoryI {
  BurgerI createBurger(String burgerName);
  BreadI createBread(String breadName);
}
