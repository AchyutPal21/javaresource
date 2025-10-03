package com.prepjava.lld.designpatterns.behavioral.observerdp;

import com.prepjava.lld.designpatterns.behavioral.observerdp.observable.StockObservableI;
import com.prepjava.lld.designpatterns.behavioral.observerdp.observable.TabletObservableImpl;
import com.prepjava.lld.designpatterns.behavioral.observerdp.observer.EmailAlterObserverImpl;
import com.prepjava.lld.designpatterns.behavioral.observerdp.observer.MobileAlertObserverImpl;
import com.prepjava.lld.designpatterns.behavioral.observerdp.observer.NotificationAlertObserverI;

public class Client {
  public static void main(String[] args) {
    // Observable Object
    StockObservableI stockObservable = new TabletObservableImpl();

    // Observer Objects has-a Observable
    NotificationAlertObserverI user1 = new EmailAlterObserverImpl(stockObservable, "user1@zoho.co.in");
    NotificationAlertObserverI user2 = new EmailAlterObserverImpl(stockObservable, "user2@yahoo.com");
    NotificationAlertObserverI user3 = new EmailAlterObserverImpl(stockObservable, "user1@hotmail.in");
    NotificationAlertObserverI user4 = new MobileAlertObserverImpl(stockObservable, "9123545908");
    NotificationAlertObserverI user5 = new MobileAlertObserverImpl(stockObservable, "9123908090");


    // Subscribe the observers
    stockObservable.addObserver(user1);
    stockObservable.addObserver(user2);
    stockObservable.addObserver(user5);
    stockObservable.addObserver(user4);
    stockObservable.addObserver(user3);

    // Adding Stock to notify
    stockObservable.setStockCount(100);
  }
}
