package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.factory.BurgerKingFactoryImpl;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.factory.FactoryI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.BurgerI;

public class Client {
  public static void main(String[] args) {
    FactoryI factory = new BurgerKingFactoryImpl();
    BurgerI cheeseBurger = factory.createBurger("CHEESE");
    cheeseBurger.prepareBurger();
  }
}
