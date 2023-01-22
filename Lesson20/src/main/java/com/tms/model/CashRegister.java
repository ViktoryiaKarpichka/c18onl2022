package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CashRegister {
    private static int countCashRegister;
    private final int id;
    private Integer queueSize;
    private final Object lock = new Object();

    public CashRegister() {
        id = ++queueSize;
    }

    public void serveCustomer(Customer customer) {
//честно говоря, вообще не понимаю куда что и кому передать(
    }
}
