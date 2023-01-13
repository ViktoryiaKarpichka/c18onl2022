package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Store {
    private CashRegister cashRegister;
    private Customer customer;
    private boolean isFree;
}
