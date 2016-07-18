package com.endava.internship.rest.model;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abursuc on 7/15/2016.
 */
@Repository
public class BookRepository {
    private List<Book> books= new ArrayList<Book>();

    public List<Book> getBooks() {
        return books;
    }

    @PostConstruct
    public void initLibrary(){
        Book b1=new Book("Book1","Author1",1);
        Book b2=new Book("Book2","Author2",2);
        Book b3=new Book("Book3","Author3",3);

        books.add(b1);
        books.add(b2);
        books.add(b3);
    }


}
