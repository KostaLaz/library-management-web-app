package com.library.demo.repository;

import com.library.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryRepository extends CrudRepository<Book, String> {



   List<Book> findByName(String name);

   List<Book> findNyAuthor(String author);

}
