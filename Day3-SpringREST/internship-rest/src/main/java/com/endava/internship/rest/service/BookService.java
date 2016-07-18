package com.endava.internship.rest.service;

import com.endava.internship.rest.model.Book;
import com.endava.internship.rest.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abursuc on 7/15/2016.
 */

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public List<Book> getBooks(){
        return bookRepository.getBooks();
    }

    public Book getBookById(Integer id){
        List<Book> books=bookRepository.getBooks();
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }


}
