package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.Book;
import insat.ecommerce.dal.repository.BookRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value="path", method=RequestMethod.GET)
    public List<Book> findAll(@RequestParam String param) {
        return (List<Book>) bookRepository.findAll();
    }
    
    
}