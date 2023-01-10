package com.tms.services;

import com.tms.models.Product;
import com.tms.models.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparingInt;


public class Main {
    public static void main(String[] args) {
        ShopServiceAware shop = new ServiceShop(new Shop());
        shop.addProduct(new Product(123L, "car", 10));
        shop.addProduct(new Product(246L, "doll", 25));
        shop.addProduct(new Product(367L, "toy", 6));
        shop.addProduct(new Product(465L, "teddy", 65));

        List<Product> listProduct = new ArrayList<>(shop.getProducts());
        System.out.println(shop.getProducts());
        Collections.sort(listProduct, comparingInt(Product::getPrice));
        System.out.println(listProduct);
        System.out.println(shop.deleteProduct(new Product(123L, "car", 10)));
        System.out.println(new ArrayList<>(shop.getProducts()));
        Collections.reverse(shop.getProducts());
        System.out.println(new ArrayList<>(shop.getProducts()));
        shop.editProduct(246L, "doll", 100); // что-то не то здесь

    }
}

