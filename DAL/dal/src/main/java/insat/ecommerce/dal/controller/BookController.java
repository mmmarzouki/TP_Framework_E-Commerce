package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.Book;
import insat.ecommerce.dal.repository.BookRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class BookController {

    //repositories
    @Autowired
    BookRepository bookRepository;

    //methods

    //find all
    @RequestMapping(value="/books", method=RequestMethod.GET)
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/books/{id}", method=RequestMethod.GET)
    public Book findOne(@PathVariable int id) {
        return bookRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/books",method=RequestMethod.POST)
    public void create(@RequestBody Book book){
        bookRepository.save(book);
    }
    
    //update
    @RequestMapping(value="/books",method=RequestMethod.PUT)
    public void update(@RequestBody Book book){
        bookRepository.save(book);
    }

    //delete
    @RequestMapping(value="/books/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable int id){
        bookRepository.deleteById(id);
    }

}