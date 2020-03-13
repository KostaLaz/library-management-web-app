package com.library.demo.repository;

import com.library.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibraryRepository extends CrudRepository<Book, String> {

   Optional<Book> findByTitle(String title);

   Optional<Book> findByAuthor(String author);

}
