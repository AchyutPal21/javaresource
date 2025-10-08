package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.factory.FactoryI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.factory.SubwayBurgerKingFactoryImpl;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.BurgerI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.BreadI;

public class Client {
  public static void main(String[] args) {
    FactoryI factory = new SubwayBurgerKingFactoryImpl();
    BreadI bread = factory.createBread("GARLIC");
    BurgerI burger = factory.createBurger("VEG");

    if (bread != null) {
      bread.prepareBread();
    }

    if (burger != null) {
      burger.prepareBurger();
    }
  }
}
