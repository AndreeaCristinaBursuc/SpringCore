package com.endava.internship.rest.model;

/**
 * Created by abursuc on 7/15/2016.
 */
public class Book {

    private String title;
    private String author;
    private Integer id;

    Book(String title, String author, Integer id){
        this.title=title;
        this.author=author;
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
