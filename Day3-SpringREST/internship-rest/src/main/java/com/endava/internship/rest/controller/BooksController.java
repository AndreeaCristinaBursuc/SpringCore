package com.endava.internship.rest.controller;

import com.endava.internship.rest.model.Book;
import com.endava.internship.rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by abursuc on 7/15/2016.
 */

@RestController
@RequestMapping(path = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BooksController {
    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public HttpEntity<Resources<Resource<Book>>> getBooks() {
        List<Book> books = this.bookService.getBooks();

        Resources<Resource<Book>> booksResources = Resources.wrap(books); //each book become a resource
        booksResources.add(linkTo(methodOn(BooksController.class).getBooks()).withRel("custom-self"));
        for(Resource<Book> bookRes:booksResources){
            bookRes.add(linkTo(methodOn(BooksController.class).getBook(bookRes.getContent().getId())).withRel("custom-self"));
        }

        return new ResponseEntity<>(booksResources, HttpStatus.OK);
    }

    @RequestMapping(path = "/{bookId}", method = RequestMethod.GET)
    public HttpEntity<Resource<Book>> getBook(@PathVariable Integer bookId) {
        Book book = this.bookService.getBookById(bookId);

        Resource<Book> bookResource = new Resource<>(book);
        bookResource.add(linkTo(methodOn(BooksController.class).getBook(bookId)).withRel("another-self"));

        return new ResponseEntity<>(bookResource, HttpStatus.OK);
    }

}
