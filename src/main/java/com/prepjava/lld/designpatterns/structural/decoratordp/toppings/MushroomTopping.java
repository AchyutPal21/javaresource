package com.prepjava.lld.designpatterns.structural.decoratordp.toppings;

import com.prepjava.lld.designpatterns.structural.decoratordp.base.BasePizza;

public class MushroomTopping extends ToppingsDecorator {
  private final BasePizza pizza;

  public MushroomTopping(BasePizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int cost() {
    return this.pizza.cost() + 110;
  }
}
