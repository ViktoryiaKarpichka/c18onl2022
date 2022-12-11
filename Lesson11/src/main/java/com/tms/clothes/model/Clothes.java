package com.tms.clothes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Clothes {
    private int size;
    private int price;
    private String color;
}
