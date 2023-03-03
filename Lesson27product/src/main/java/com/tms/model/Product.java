package com.tms.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Product {

    private int id;
    private String imageName;
    private String name;
    private String description;
    private BigDecimal price;
    private int categoryId;
}
