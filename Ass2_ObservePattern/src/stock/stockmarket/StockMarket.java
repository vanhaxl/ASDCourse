package stock.stockmarket;

import stock.observer.IObserver;

public class StockMarket extends AbstractMarket {
    public void addStock(String stockSymbol, Double price) {
        getStocklist().put(stockSymbol, price);
    }

    public void update(String stockSymbol, Double price) {
        getStocklist().put(stockSymbol, price);
        notifyUpdate();
        for (IObserver observer : observers) {
            observer.update(getStocklist());
        }
    }
}
