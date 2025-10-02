package com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.DriveStrategy;

public class BaseEdition implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("This is Base Edition with [Drum Brake, 50km/L]");
  }

}
