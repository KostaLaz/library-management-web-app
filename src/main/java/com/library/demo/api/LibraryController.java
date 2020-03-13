package com.library.demo.api;

import com.library.demo.domain.Book;
import com.library.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/books")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;


    @GetMapping("/all"){
        public Collection<Book> books(){
            return libraryService.findAll();
        }
    }

}
