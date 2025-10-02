package com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl.FutureNeedEdition;

public class ElectricVehicle extends Vehicle {
  public ElectricVehicle() {
    super(new FutureNeedEdition());
  }
}
