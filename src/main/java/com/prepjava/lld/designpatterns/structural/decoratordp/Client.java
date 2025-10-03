package com.prepjava.lld.designpatterns.structural.decoratordp;


import com.prepjava.lld.designpatterns.structural.decoratordp.base.BasePizza;
import com.prepjava.lld.designpatterns.structural.decoratordp.base.FarmhousePizza;
import com.prepjava.lld.designpatterns.structural.decoratordp.base.MargaritaPizza;
import com.prepjava.lld.designpatterns.structural.decoratordp.base.VegDelightPizza;
import com.prepjava.lld.designpatterns.structural.decoratordp.toppings.MozzarellaCheese;
import com.prepjava.lld.designpatterns.structural.decoratordp.toppings.MushroomTopping;
import com.prepjava.lld.designpatterns.structural.decoratordp.toppings.PaneerAndCorn;

public class Client {
  public static void main(String[] args) {
    BasePizza pizza1 = new MozzarellaCheese(new PaneerAndCorn(new FarmhousePizza()));
    BasePizza pizza2 = new MushroomTopping(new MargaritaPizza());
    BasePizza pizza3 = new MushroomTopping(new PaneerAndCorn(new VegDelightPizza()));


    System.out.println("..........Bill..........\nOrder Item(s)--------------------------------");
    System.out.println("1. Farmhouse Pizza [Mozzarella cheese, Paneer, Corn]..........Rs: " + pizza1.cost() + "/-");
    System.out.println("2. Margherita Pizza [Mushroom]..........Rs: " + pizza2.cost() + "/-");
    System.out.println("3. VegDelight Pizza [Mushroom, Paneer, Corn]..........Rs: " + pizza3.cost() + "/-");
    System.out.println("--------------------------------\nTotal Amount: " + (pizza1.cost() + pizza2.cost() + pizza3.cost()) + " Rs/-");
  }
}
