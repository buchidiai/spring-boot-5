package com.springboot5.springboot5.controller;



//@controller registers/turns this class to a bean so it gets wired into the spring context


import com.springboot5.springboot5.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    // autowire / add book repository
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    //@Param -> Model  Object -> MVC

    //path to request url
    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        //get all the authors from the repository
        //use hibernate to get books from db
        model.addAttribute("authors", authorRepository.findAll());

        //return books as String/variable for thymeleaf view
        return "authors";
    }
}
