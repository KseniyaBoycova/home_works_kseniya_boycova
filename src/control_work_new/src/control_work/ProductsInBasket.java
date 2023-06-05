package control_work;

public class ProductsInBasket {
    Products productInBasket;
    int numberInBasket;

    public ProductsInBasket(Products productInBasket, int numberInBasket) {
        this.productInBasket = productInBasket;
        this.numberInBasket = numberInBasket;
    }

    public Products getProductInBasket() {
        return productInBasket;
    }

    public int getNumberInBasket() {
        return numberInBasket;
    }
}
