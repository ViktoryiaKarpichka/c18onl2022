package com.tms.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    private Long id;
    private String name;
    private String surname;
    private String password;
    private String email;
    private String birthday;
    private int balance;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
