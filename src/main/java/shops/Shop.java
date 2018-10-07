package shops;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countStock() {
        return stock.size();
    }

    public void addStockItem(ISell stockitem){
        this.stock.add(stockitem);
    }
    public ISell removeStockItem(int index){
       return this.stock.remove(index);
    }
}
