package com.prepjava.lld.designpatterns.structural.decoratordp.toppings;

import com.prepjava.lld.designpatterns.structural.decoratordp.base.BasePizza;

// These class are making is-a relation with ToppingsDecorator
public class PaneerAndCorn extends ToppingsDecorator {
  private final BasePizza pizza;

  public PaneerAndCorn(BasePizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int cost() {
    return this.pizza.cost() + 110;
  }

}
