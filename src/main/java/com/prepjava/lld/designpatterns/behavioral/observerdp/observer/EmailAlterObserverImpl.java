package com.prepjava.lld.designpatterns.behavioral.observerdp.observer;

import com.prepjava.lld.designpatterns.behavioral.observerdp.observable.StockObservableI;

public class EmailAlterObserverImpl implements NotificationAlertObserverI {

  private final StockObservableI observable;
  private String emailId;

  public EmailAlterObserverImpl(StockObservableI observable, String emailId) {
    this.observable = observable;
    this.emailId = emailId;
  }

  @Override
  public void update() {
    int currentStock = observable.getStockCount();
    String message = "HurryUp!!! Only last " + currentStock + " are left";
    sendEmail(emailId, message);
  }

  void sendEmail(String emailId, String message) {
    System.out.println("An email send to " + emailId + " successfully for `" + message + "`");
  }



}
