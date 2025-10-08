package com.prepjava.lld.designpatterns.creational.factoryandabstractfactorydp.simplefactory;

public class ShapeFactory {
  // This factory method takes the business logic
  // and based on conditions you return object
  public ShapeI getShape(String shapeType) {
    ShapeI shape;
    switch (shapeType) {
      case "CIRCLE":
        shape = new CircleShapeImpl();
        break;
      case "TRIANGLE":
        shape = new TriangleShapeImpl();
        break;
      case "SQUARE":
        shape = new SquareShapeImpl();
        break;
      default:
        shape = null;
        break;
    }

    return shape;
  }
}
