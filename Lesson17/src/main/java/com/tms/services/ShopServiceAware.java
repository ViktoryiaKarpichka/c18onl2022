package com.tms.services;

import com.tms.models.Product;

import java.util.List;

public interface ShopServiceAware {
    List<Product> getProducts();

    boolean addProduct(Product product);

    boolean deleteProduct(Product product);

    void editProduct(int id, String name, int Price, Product product);
}