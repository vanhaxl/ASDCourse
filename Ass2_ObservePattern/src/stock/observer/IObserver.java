package stock.observer;

import java.util.Map;

public interface IObserver {
    void update(Map<String, Double> stocklist);
}
