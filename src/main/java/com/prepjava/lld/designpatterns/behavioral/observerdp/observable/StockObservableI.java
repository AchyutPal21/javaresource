package com.prepjava.lld.designpatterns.behavioral.observerdp.observable;

import com.prepjava.lld.designpatterns.behavioral.observerdp.observer.NotificationAlertObserverI;

public interface StockObservableI {
  void addObserver(NotificationAlertObserverI observer);
  void removeObserver(NotificationAlertObserverI observer);
  void notifySubscribedObserver();
  void setStockCount(int stockCount);
  int getStockCount();
}
