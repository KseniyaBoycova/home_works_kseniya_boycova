package control_work;

public class Products {

    public String name;
    public double price;
    public double percentOfDiscount=0;

    public double getPrice() {
        return price;
    }

    public double getPercentOfDiscount() {
        return percentOfDiscount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
