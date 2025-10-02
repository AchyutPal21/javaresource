package com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl.BaseEdition;

public class PassengerVehicle extends Vehicle {

  public PassengerVehicle() {
    super(new BaseEdition());
  }

}
