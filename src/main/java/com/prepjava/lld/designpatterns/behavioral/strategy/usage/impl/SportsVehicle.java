package com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl.SportsEdition;

public class SportsVehicle extends Vehicle {

  public SportsVehicle() {
    super(new SportsEdition());
  }
}
