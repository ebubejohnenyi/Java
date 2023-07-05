package EStore;

import java.util.ArrayList;
import java.util.List;

public class CheckOut {
    private List <Product> newProductList = new ArrayList<>();
    private double vat = 17.50/100;
    public void store(String productName, int productQuantity, int productPrice) {
        Product product = new Product(productName,productQuantity,productPrice);
        newProductList.add(product);
//        bill = subTotal() - discount(0)
    }

    public int getAddedProduct() {
        return newProductList.size();
    }

    public double subTotal() {
        double subTotal_Price =0;
        for (Product products: newProductList) {
             subTotal_Price += (products.getPrice() * products.getQuantity());
        }
        return subTotal_Price;
    }

    public double discount(double discount) {
        return subTotal() * discount/100;
    }

    public double vat() {
        return subTotal() * vat;
    }
    public double bill_Total() {
        return subTotal() - discount(7) + vat();
    }

    public double balance(int amountPaid) {
        return bill_Total() - amountPaid;
    }
}
