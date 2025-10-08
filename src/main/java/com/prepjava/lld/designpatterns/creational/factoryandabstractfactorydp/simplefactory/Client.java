package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.simplefactory;

public class Client {
  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    ShapeI shape = factory.getShape("CIRCLE");
    shape.draw();
  }
}
