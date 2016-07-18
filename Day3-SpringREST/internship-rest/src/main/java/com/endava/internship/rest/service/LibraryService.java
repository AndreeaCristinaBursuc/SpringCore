package com.endava.internship.rest.service;

import com.endava.internship.rest.model.Book;
import com.endava.internship.rest.model.BookRepository;
import com.endava.internship.rest.model.Library;
import com.endava.internship.rest.model.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by abursuc on 7/15/2016.
 */
public class LibraryService {
    @Autowired
    LibraryRepository libraryRepository;

    public List<Library> getLibraries(){
        return libraryRepository.getLibraries();
    }

    public Library getLibraryById(Integer id){
        List<Library> libraries=libraryRepository.getLibraries();
        for(Library library:libraries){
            if(library.getId()==id){
                return library;
            }
        }
        return null;
    }


}
