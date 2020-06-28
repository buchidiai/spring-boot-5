package com.springboot5.springboot5.repository;

import com.springboot5.springboot5.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book, Long> {



}
