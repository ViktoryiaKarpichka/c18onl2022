package com.tms.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Category {

    private int id;
    private String name;
    private String imageName;
    private List<Product> productsList;

    public Category(int id, String name, String imageName) {
        this.id = id;
        this.name = name;
        this.imageName = imageName;
    }
}

