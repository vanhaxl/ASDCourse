package stock.stockmarket;

import stock.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void dettach(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyUpdate() {
        System.out.println("Notify Update");
    }
}
