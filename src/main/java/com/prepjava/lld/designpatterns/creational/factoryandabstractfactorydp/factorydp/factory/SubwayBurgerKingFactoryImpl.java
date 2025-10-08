package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.factory;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.BurgerI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.PaneerTikiBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.factorydp.product.VegBurger;

public class SubwayBurgerKingFactoryImpl implements FactoryI {

  @Override
  public BurgerI createBurger(String burgerName) {
    BurgerI burger;
    switch (burgerName) {
      case "VEG":
        burger = new VegBurger();
        break;
      case "PANEER":
        burger = new PaneerTikiBurger();
        break;
      default:
        burger = null;
        break;
    }

    return burger;
  }

}
