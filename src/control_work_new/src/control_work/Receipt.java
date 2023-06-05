package control_work;

import java.util.List;

public class Receipt {

    public List<ProductsInBasket> receipt;
    public double summa;
    public double totalSumma;



    public Receipt(List<ProductsInBasket> receipt) {
        this.receipt = receipt;
        for (ProductsInBasket product: receipt) {
            this.totalSumma += product.getNumberInBasket() *
                    (product.productInBasket.getPrice() - (product.productInBasket.getPrice() * (product.productInBasket.getPercentOfDiscount() / 100)));
        }
    }

    public List<ProductsInBasket> getReceipt() {
        return receipt;
    }

    public double getTotalSumma() {
        return totalSumma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < receipt.size(); i++) {
            ProductsInBasket productInCart = receipt.get(i);
            summa= productInCart.getNumberInBasket()*
                    (productInCart.productInBasket.getPrice()- productInCart.productInBasket.getPrice()* (productInCart.productInBasket.getPercentOfDiscount()/100));
            sb.append(String.format("%d. %s, Количество — %d, Сумма - %.2f\n",
                    i + 1, productInCart.getProductInBasket() ,productInCart.getNumberInBasket(),summa ));
        }
        sb.append(String.format("Итого надо заплатить: %.2f", totalSumma));
        return sb.toString();
    }
}
