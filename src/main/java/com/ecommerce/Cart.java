package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;


    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product p : this.products) {
            total += p.getPrice();
        }

        return total;
    }

    public List<Product> getProducts() {
        return this.products;
    }

}
