package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private String description;
    private BigDecimal price;

    public Product(String description) {
        this.description = description;
    }
}
