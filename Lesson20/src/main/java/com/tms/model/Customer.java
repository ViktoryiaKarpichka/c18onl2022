package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Customer extends Thread {
    private int countCustomer;
    private List<Product> products;

    public Customer(List<Product> products) {
        if (products == null) {
            products = new ArrayList<>();
        }
        this.products = products;
    }

    @Override
    public void run() {

    }
}
