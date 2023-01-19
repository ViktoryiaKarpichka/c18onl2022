package com.tms.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    public List<Reader> getReaders() {
        if (readers == null) {
            readers = new ArrayList<Reader>();
        }
        return readers;
    }
}

