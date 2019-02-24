package stock;

import stock.observer.IObserver;
import stock.observer.StockBuyer;
import stock.observer.StockViewer;
import stock.stockmarket.StockMarket;

public class Application {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        IObserver stockBuyer = new StockBuyer();
        IObserver stockViewer = new StockViewer();

        stockMarket.attach(stockBuyer);
        stockMarket.attach(stockViewer);

        stockMarket.addStock("ORC", 12.23);
        stockMarket.addStock("MSC", 45.78);

        stockMarket.update("ORC", 12.34);
        stockMarket.update("MSC", 44.68);
    }
}
