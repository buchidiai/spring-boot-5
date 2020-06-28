package com.springboot5.springboot5.repository;

import com.springboot5.springboot5.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
