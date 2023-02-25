package com.tms.service;

import com.tms.model.Product;
import com.tms.model.ProductAware;

import java.util.Arrays;
import java.util.List;

public class ProductService implements ProductAware {

    private List<Product> products;

    public ProductService(List<Product> productsList) {
        this.products = productsList;
    }

    @Override
    public List<Product> createProductsList() {
        return products = Arrays.asList(
                new Product("phones.jsp"),
                new Product("laptops.jsp"),
                new Product("jpsNavs.jsp"),
                new Product("fridges.jsp"),
                new Product("cars.jsp"),
                new Product("cameras.jsp"));
    }
}
