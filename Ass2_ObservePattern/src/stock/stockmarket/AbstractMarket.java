package stock.stockmarket;

import java.util.HashMap;
import java.util.Map;

public abstract  class AbstractMarket extends Subject {
    private Map<String, Double> stocklist = new HashMap<>();

    public Map<String, Double> getStocklist(){
        return stocklist;
    }

}
