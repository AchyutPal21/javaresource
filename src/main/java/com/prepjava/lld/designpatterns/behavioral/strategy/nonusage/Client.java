package com.prepjava.lld.designpatterns.behavioral.strategy.nonusage;

public class Client {
  public static void main(String[] args) {
    OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
    offRoadVehicle.drive();

    SportsVehicle sportsVehicle = new SportsVehicle();
    sportsVehicle.drive();

    PassengerVehicle passengerVehicle = new PassengerVehicle();
    passengerVehicle.drive();
  }
}
