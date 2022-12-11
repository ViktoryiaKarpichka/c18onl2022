package com.tms.clothes.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum SizeClothes {
    XXS(32) {
        @Override
        void getDescription() {
            System.out.println("Child size");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    SizeClothes(int euroSize) {
        this.euroSize = euroSize;
    }

    void getDescription() {
        System.out.println("Adult size");
    }
}