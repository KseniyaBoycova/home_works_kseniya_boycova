package control_work;

public class Customer {
    public static void main(String[] args) {
        Shop store= new Shop();
        GeneralProduct pan= new GeneralProduct("Pan", 3);
        GeneralProduct milk= new GeneralProduct("Milk", 5);
        GeneralProduct bread= new GeneralProduct("Bread", 4);
        SaleProduct toy= new SaleProduct("Toy", 8, 5);
        SaleProduct doll =new SaleProduct("Doll", 10, 10);
        SaleProduct car =new SaleProduct("Car", 9, 5);
        DiscountProduct ship= new DiscountProduct("Ship", 23, 50, "Broken");
        DiscountProduct plane= new DiscountProduct("Plane", 15, 50, "Broken");
        DiscountProduct phone= new DiscountProduct("Phone", 5, 25, "Broken");

        store.addProductToList(pan);
        store.addProductToList(milk);
        store.addProductToList(bread);
        store.addProductToList(toy);
        store.addProductToList(doll);
        store.addProductToList(ship);
        store.addProductToList(car);
        store.addProductToList(plane);
        store.addProductToList(phone);

        Basket basket= store.getNewBasket();

        basket.addProductToBasket(pan,3);
        basket.addProductToBasket(doll,3);
        basket.addProductToBasket(plane,3);
        basket.addProductToBasket(milk,3);
        basket.addProductToBasket(bread,3);
        basket.addProductToBasket(toy,3);
        basket.addProductToBasket(pan,3);
        basket.addProductToBasket(ship,3);
        basket.addProductToBasket(phone,3);

        Receipt receipt=store.getReceipt(basket);
        System.out.println(receipt);
    }
}
