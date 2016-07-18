package com.endava.internship.rest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abursuc on 7/15/2016.
 */
public class Library {

    private List<Book> libraryBooks=new ArrayList<Book>();
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    Library (Integer id, List<Book> lib){
        this.libraryBooks=lib;
        this.id=id;
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }



}
