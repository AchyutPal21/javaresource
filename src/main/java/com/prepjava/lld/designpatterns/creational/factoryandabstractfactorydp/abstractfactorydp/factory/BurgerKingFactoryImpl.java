package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.factory;

import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.BurgerI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.CheeseBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.GrilledBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.productone.PeriPeriBurger;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.BreadI;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.MixedGrainedBreadImpl;
import com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.abstractfactorydp.producttwo.OatsBreadImpl;

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

  @Override
  public BreadI createBread(String breadName) {
    BreadI bread;
    switch (breadName) {
      case "OATS":
        bread = new OatsBreadImpl();
        break;
      case "MIXGRAIN":
        bread = new MixedGrainedBreadImpl();
        break;
      default:
        bread = null;
        break;
    }

    return bread;
  }

}
