package com.tms.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category {

    private String id;
    private String name;
    private String imageName;
    private List<Product> products;

    public Category(String id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}

