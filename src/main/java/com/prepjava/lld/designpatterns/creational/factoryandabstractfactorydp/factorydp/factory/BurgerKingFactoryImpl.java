package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.factory;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.BurgerI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.CheeseBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.GrilledBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.PeriPeriBurger;

public class BurgerKingFactoryImpl implements FactoryI {

  @Override
  public BurgerI createBurger(String burgerName) {
    BurgerI burger;
    switch (burgerName) {
      case "CHEESE":
        burger = new CheeseBurger();
        break;
      case "GRILLED":
        burger = new GrilledBurger();
        break;
      case "PERIPERI":
        burger = new PeriPeriBurger();
        break;
      default:
        burger = null;
        break;
    }

    return burger;
  }

}
