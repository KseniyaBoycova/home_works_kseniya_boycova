package control_work;

public class DiscountProduct extends Products {
    public String name;
    public double price;
    public double percentOfDiscount;
    public String reason;

    public DiscountProduct(String name, double price, int percentOfSale, String reason) {
        this.name = name;
        this.price = price;
        this.percentOfDiscount = percentOfSale;
        this.reason = reason;
    }
    public double getPrice() {
        return price;
    }

    public double getPercentOfDiscount() {
        return percentOfDiscount;
    }

    @Override
    public String toString() {
        return name+", Цена — "+price+", Скидка - "+ percentOfDiscount +"%"+", Причина ученки - "+reason ;
    }
}
