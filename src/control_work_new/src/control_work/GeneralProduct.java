package control_work;

public class GeneralProduct extends Products{

    public String name;
    public double price;

    public GeneralProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name+", Цена — "+price ;
    }
}
