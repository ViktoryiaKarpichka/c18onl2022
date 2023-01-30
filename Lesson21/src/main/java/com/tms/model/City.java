package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class City {
    private String nameCity;
    private long id;

    public City(String nameCity) {
        this.nameCity = nameCity;
    }
}
