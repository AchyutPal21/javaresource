package com.prepjava.lld.solid;

import java.sql.Date;

// Single Responsibility Principle says every class should have exactly one reason to change
// and every class should have exactly one responsibility.

// Example
class Marker {
  public String color;
  public float price;
  public Date mfd;
  public Date expd;

  public Marker (String color, float price, Date mfd, Date expd) {
    this.color = color; 
    this.price = price;
    this.mfd = mfd;
    this.expd = expd;
  }

}

class Invoice {
  private Marker marker;
  private int quantity;

  public Invoice(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public float calculatePrice() {
    return (this.marker.price * this.quantity);
  }

  public void printInvoice() {
    System.out.println("Printing invoice");
    return;
  }

  public void saveToDB() {
    System.out.println("Store to db");
    return;
  }
}

public class SRP {
  /*
   *
   * class Invoice have multiple reason to change
   * 1. calculatePrice() may get change, may be it need's to
   * calculate the price in future including gst and discount
   * 
   * 2. printInvoice() may get change, may need to update the
   * entire format entirely, including gst and discount details
   * 
   * 3. saveToDB() may get change, may be tomorrow need to save in
   * no-sql db also as per the requirement also in file who knows
   * 
   * These all are becoming a reason to change the Invoice class and
   * not following the SRP.
   * 
   * --------------------------------------------------------------
   * Below you can see how we have separated the classes and these
   * classes have only one responsibility and have only one 
   * reason to get change.
   * 
   */
}

class InvoiceSRP {
  private Marker marker;
  private int quantity;

  public InvoiceSRP(Marker marker, int quantity) {
    this.marker = marker;
    this.quantity = quantity;
  }

  public float calculatePrice() {
    return (this.marker.price * this.quantity);
  }
}

class InvoiceDaoSRP {
  private InvoiceSRP invoiceSRP;
  public InvoiceDaoSRP (InvoiceSRP invoiceSRP) {
    this.invoiceSRP = invoiceSRP;
  }

  public void saveToSQL() {
    float cost = invoiceSRP.calculatePrice();
    System.out.println("Store to db" + cost);
    return;
  }
}

class InvoicePrint {
  private InvoiceSRP invoiceSRP;
  public InvoicePrint (InvoiceSRP invoiceSRP) {
    this.invoiceSRP = invoiceSRP;
  }

  public void print() {
    float cost = invoiceSRP.calculatePrice();
    System.out.println("Print Invoice cost" + cost);
    return;
  }
}
