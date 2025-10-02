package com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.DriveStrategy;

public class SportsEdition implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("This is Sports Edition with [Traction control, Dual ABS]");
  }

}
