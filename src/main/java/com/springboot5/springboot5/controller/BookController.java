package com.springboot5.springboot5.controller;


import com.springboot5.springboot5.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//@controller registers/turns this class to a bean so it gets wired into the spring context


@Controller
public class BookController {

    // autowire / add book repository
    private BookRepository bookRepository;

    //when spring creates this class it will inject the /autowire of the book repositiry
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //@Param -> Model  Object -> MVC

    //path to request url
    @RequestMapping("/books")
    public String getBooks(Model model) {

        System.out.println(model + " model");
        //get all the books from the repository
        //use hibernate to get books from db
        model.addAttribute("books", bookRepository.findAll());

        //return books as String/variable for thymeleaf view
        return "books";
    }
}
