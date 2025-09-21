package Nivel1;


import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products = new ArrayList<>();
    private double totalPrice = (double)0.0F;

    public void addProduct(Product product) {
        if (product != null) {
            this.products.add(product);
        }

    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void calculateTotalPrice() throws EmptySaleException {
        if (this.products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            double sum = (double)0.0F;

            for(Product product : this.products) {
                sum += product.getPrice();
            }

            this.totalPrice = sum;
        }
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
}