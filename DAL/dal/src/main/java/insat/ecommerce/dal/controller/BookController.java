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
    @RequestMapping(value="/book", method=RequestMethod.GET)
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/book/{id}", method=RequestMethod.GET)
    public Book findOne(@PathVariable int id) {
        return bookRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/book",method=RequestMethod.POST)
    public String create(@RequestBody Book book){
        bookRepository.save(book);
        
        return "{\"code\":200}";
    }
    
    //update
    @RequestMapping(value="/book",method=RequestMethod.PUT)
    public Book update(@RequestBody Book book){
        bookRepository.save(book);
        return book;
    }

    //delete
    @RequestMapping(value="/book/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        bookRepository.deleteById(id);
        
        return "{\"code\":200}";
    }

}