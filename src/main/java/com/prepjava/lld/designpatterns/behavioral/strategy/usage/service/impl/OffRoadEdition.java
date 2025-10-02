package com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.DriveStrategy;

public class OffRoadEdition implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("This is Off-Road Edition with [210mm Ground Clearance, Heavy Suspension]");
  }

}
