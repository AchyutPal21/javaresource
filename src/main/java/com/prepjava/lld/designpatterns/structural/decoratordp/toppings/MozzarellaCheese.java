package com.prepjava.lld.designpatterns.structural.decoratordp.toppings;

import com.prepjava.lld.designpatterns.structural.decoratordp.base.BasePizza;

public class MozzarellaCheese extends ToppingsDecorator {
  private final BasePizza pizza;

  public MozzarellaCheese(BasePizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int cost() {
    return this.pizza.cost() + 110;
  }
}
