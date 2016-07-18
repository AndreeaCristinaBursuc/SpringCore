package com.endava.internship.rest.model;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abursuc on 7/15/2016.
 */

@Repository
public class LibraryRepository {

    private List<Library> libraries= new ArrayList<Library>();
    public List<Library> getLibraries() {
        return libraries;
    }

    @PostConstruct
    public void initLibrary(){
        //List Library1
        List<Book> list1=new ArrayList<Book>();
        Book b1=new Book("Book1","Author1",1);
        Book b2=new Book("Book2","Author2",2);
        Book b3=new Book("Book3","Author3",3);

        list1.add(b1);
        list1.add(b2);
        list1.add(b3);

        //List Library2

        List<Book> list2=new ArrayList<Book>();
        Book b4=new Book("Book4","Author4",4);
        Book b5=new Book("Book5","Author5",5);
        Book b6=new Book("Book6","Author6",6);

        list2.add(b4);
        list2.add(b5);
        list2.add(b6);



        Library lib1=new Library(1,list1);
        Library lib2=new Library(2,list2);


    }

}
