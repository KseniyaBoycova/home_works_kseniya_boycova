package control_work;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    public List<ProductsInBasket> listInBasket = new ArrayList<>();

    public void addProductToBasket(Products product, int number){
        listInBasket.add(new ProductsInBasket(product,number));
    }

    public List<ProductsInBasket> getListInBasket() {
        return listInBasket;
    }


}
