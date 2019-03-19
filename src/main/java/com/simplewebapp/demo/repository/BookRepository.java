package com.simplewebapp.demo.repository;

import com.simplewebapp.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
  List<Book> findByTitle(String title);
  }
