package com.tms.services;

import com.tms.models.Product;
import com.tms.models.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ShopServiceAware productList = new ServiceShop(new Shop());
        productList.addProduct(new Product(123, "car", 10));
        productList.addProduct(new Product(246, "doll", 25));
        productList.addProduct(new Product(367, "toy", 6));
        productList.addProduct(new Product(465, "teddy", 65));

        ArrayList<Product> productArrayList = new ArrayList<>(productList.getProducts());
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println(productArrayList);
        System.out.println(productList.deleteProduct(new Product(123, "car", 10)));
        // ???? по порядку добавления не могу сообразить как

    }
}

