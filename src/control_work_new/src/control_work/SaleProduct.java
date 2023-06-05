package control_work;

public class SaleProduct extends Products{

    public String name;
    public double price;
    public double percentOfDiscount;

    public SaleProduct(String name, double price, int percentOfSale) {
        this.name = name;
        this.price = price;
        this.percentOfDiscount = percentOfSale;
    }

    public double getPrice() {
        return price;
    }

    public double getPercentOfDiscount() {
        return percentOfDiscount;
    }

    @Override
    public String toString() {
        return name+", Цена — "+price+", Скидка - "+ percentOfDiscount +"%" ;
    }
}
