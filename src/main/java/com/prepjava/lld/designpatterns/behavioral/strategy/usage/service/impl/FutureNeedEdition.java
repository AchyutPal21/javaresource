package com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.impl;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.service.DriveStrategy;

public class FutureNeedEdition implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("This is the Future-Requirement drive strategy... We can easy add this without any extra effort");
  }

}
