package com.springboot5.springboot5.bootstrap;

import com.springboot5.springboot5.model.Author;
import com.springboot5.springboot5.model.Book;
import com.springboot5.springboot5.model.Publisher;
import com.springboot5.springboot5.repository.AuthorRepository;
import com.springboot5.springboot5.repository.BookRepository;
import com.springboot5.springboot5.repository.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

//@component makes the class a spring Bean

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {


        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher publisher1 = new Publisher("Harper Collins", "1234 drive ln");
        publisherRepository.save(publisher1);
        Book ddd = new Book("Domain Driven Design", "1234", publisher1);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher publisher2 = new Publisher("Harper Collins", "200 s coona dr");
        publisherRepository.save(publisher2);
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher2);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);


        //bobby
        Author bobby = new Author("boddy", "Mishells");
        Publisher publisher3 = new Publisher("Devon mills", "6565 denver dr");
        publisherRepository.save(publisher3);
        Book js = new Book("Modern JavaScript", "54332", publisher3);
        bobby.getBooks().add(js);
        js.getAuthors().add(bobby);

        authorRepository.save(bobby);
        bookRepository.save(js);
    }
}