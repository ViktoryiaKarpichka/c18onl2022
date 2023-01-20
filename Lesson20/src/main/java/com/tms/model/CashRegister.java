package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CashRegister {
    private int countCashRegister;
    private Integer queueSize;

    public void serveCustomer(Customer customer) {

    }
}
