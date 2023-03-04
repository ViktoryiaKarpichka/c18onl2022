package com.tms.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Cart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product myProduct) {
        products.add(myProduct);
    }

    public void deleteProduct(Product myProduct) {
        products.remove(myProduct);
    }
}
