package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.factory;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.BurgerI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.PaneerTikiBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.VegBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.BreadI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.GarlicBreadImpl;

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

  @Override
  public BreadI createBread(String breadName) {
    BreadI bread;
    switch (breadName) {
      case "GARLIC":
        bread = new GarlicBreadImpl();
        break;

      default:
        bread = null;
        break;
    }

    return bread;
  }

}
