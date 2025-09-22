package nivel1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotalPrice();
            System.out.println("The total is :" + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println("EmptySaleException caught:" + e.getMessage());
        }

        sale.addProduct(new Product("Book", (double)10.5));
        sale.addProduct(new Product("Tablet", (double)1250.5));
        sale.addProduct(new Product("Laptop", 1950.65));

        try {
            sale.calculateTotalPrice();
            System.out.println("The total after adding product is :" + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        }

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Headphones", (double)150.5));
        productList.add(new Product("Tablet", (double)1250.5));
        productList.add(new Product("Laptop", 1850.65));

        try {
            Product p = (Product)productList.get(5);
            System.out.println("The total after adding product at index 5 :" + String.valueOf(p));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
        }

    }
}