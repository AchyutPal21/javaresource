package com.prepjava.lld.designpatterns.behavioral.observerdp.observable;

import java.util.LinkedList;
import java.util.List;

import com.prepjava.lld.designpatterns.behavioral.observerdp.observer.NotificationAlertObserverI;

public class TabletObservableImpl implements StockObservableI {
  // List to keep all the observer list who have subscribed to this Observable
  List<NotificationAlertObserverI> observerList = new LinkedList<>();
  int stockCount = 0;

  @Override
  public void addObserver(NotificationAlertObserverI observer) {
    this.observerList.add(observer);
  }

  @Override
  public void removeObserver(NotificationAlertObserverI observer) {
    this.observerList.remove(observer);
  }

  @Override
  public void notifySubscribedObserver() {
    for (NotificationAlertObserverI obs : observerList) {
      obs.update();
    }
  }

  @Override
  public void setStockCount(int stockCount) {
    this.stockCount = stockCount;
    notifySubscribedObserver();
  }

  @Override
  public int getStockCount() {
    return stockCount;
  }

}
