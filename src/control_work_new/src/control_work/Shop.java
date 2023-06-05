package control_work;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    public List<Products> list= new ArrayList<>();

    public void addProductToList(Products product){
        list.add(product);
    }

    public Basket getNewBasket(){
        return new Basket();
    }

    public Receipt getReceipt(Basket basket){
        return new Receipt(basket.getListInBasket());
    }
}
