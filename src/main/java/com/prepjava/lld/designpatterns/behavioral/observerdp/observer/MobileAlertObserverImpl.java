package com.prepjava.lld.designpatterns.behavioral.observerdp.observer;

import com.prepjava.lld.designpatterns.behavioral.observerdp.observable.StockObservableI;

public class MobileAlertObserverImpl implements NotificationAlertObserverI {

  private final StockObservableI observable;
  private String mobileNumber;

  public MobileAlertObserverImpl(StockObservableI observable, String mobileNumber) {
    this.observable = observable;
    this.mobileNumber = mobileNumber;
  }

  @Override
  public void update() {
    int currentStock = observable.getStockCount(); // Like this we can more business logics here

    String message = "Hurry-Up!!!\n" + "Stock refilled to " + currentStock + "\nPlace your order before getting stock-out again......";
    sendMsgToMobile(mobileNumber, message);
  }

  void sendMsgToMobile(String mobileNumber, String message) {
    System.out.println("Send send to " + mobileNumber + " successfully. For `" + message + "`");
  }
}