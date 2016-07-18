package com.endava.internship.rest.controller;

import com.endava.internship.rest.model.Book;
import com.endava.internship.rest.model.Library;
import com.endava.internship.rest.service.BookService;
import com.endava.internship.rest.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(path = "/libraries", produces = MediaType.APPLICATION_JSON_VALUE)
public class LibraryController {

        @Autowired
        private LibraryService libraryService;

        @RequestMapping(method = RequestMethod.GET)
        public HttpEntity<Resources<Resource<Library>>> getLibraries() {
            List<Library> libs = this.libraryService.getLibraries();

            Resources<Resource<Library>> libsResources = Resources.wrap(libs); //each lib become a resource
            libsResources.add(linkTo(methodOn(LibraryController.class).getLibraries()).withRel("custom-self"));

            for(Resource<Library> libRes:libsResources){
                libRes.add(linkTo(methodOn(LibraryController.class).getLib(libRes.getContent().getId())).withRel("custom-self"));

                Resources<Resource<Book>> booksResources = Resources.wrap(libRes.getContent().getLibraryBooks());
                for(Resource<Book> bk:booksResources){
                    bookRes.add(linkTo(methodOn(BooksController.class).getBook(bookRes.getContent().getId())).withRel("custom-self"));

                }

                //bookRes.add(linkTo(methodOn(com.endava.internship.rest.controller.BooksController.class).getBook(bookRes.getContent().getId())).withRel("custom-self"));
            }

            return new ResponseEntity<>(booksResources, HttpStatus.OK);
        }

}
