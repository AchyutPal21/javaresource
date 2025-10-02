package com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl.OffRoadEdition;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new OffRoadEdition());
  }
}
