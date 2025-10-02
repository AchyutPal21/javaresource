package com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.DriveStrategy;

public class Vehicle {
  private DriveStrategy driveStrategy;

  public Vehicle(DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    this.driveStrategy.drive();
  }
}
