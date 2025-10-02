package com.prepjava.lld.designpatterns.behavioral.strategy.usage;

import com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl.ElectricVehicle;
import com.prepjava.lld.designpatterns.behavioral.strategy.usage.impl.OffRoadVehicle;

public class Client {
  public static void main(String[] args) {
    OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
    offRoadVehicle.drive();

    ElectricVehicle electricVehicle = new ElectricVehicle();
    electricVehicle.drive();
  }
}
