/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Request;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author likhithng
 */
public class Stock {
    private List<Item> stockList;
    public Stock(){
        stockList = new ArrayList<Item>();
    }

    public List<Item> getStockList() {
        return stockList;
    }

    public void setMenu(List<Item> menu) {
        this.stockList = menu;
    }
    public Item updateMenu(){
        Item dish = new Item();
        stockList.add(dish);
        return dish;
    }
    public void deleteDish(Item dish)
    {
        stockList.remove(dish);
    }
}
