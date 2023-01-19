package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmailAddress {
    private String email;
    private String someDate;

    public EmailAddress(String email) {
    }
}

