package org.jais.nla.controller;

import org.jais.nla.domain.model.Book;
import org.jais.nla.domain.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vandanajaiswal on 8/12/2018.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private LibraryService libraryService;

    @RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
    public List<Book> findAll() {
        return libraryService.getAllBooks();
    }

}