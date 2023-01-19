package com.tms.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class Category {
        private String name;
        private Set<Product> products;

}
