package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.CartBook;
import insat.ecommerce.dal.repository.CartBookRepository;


@RestController
public class CartBookController {
    //repositories
    @Autowired
    CartBookRepository cartBookRepository;

    //methods
    //find all
    @RequestMapping(value="/cartBook",method=RequestMethod.GET)
    public List<CartBook> findAll(){
        return (List<CartBook>) cartBookRepository.findAll();
    }
    //find by id
    @RequestMapping(value="/cartBook/{id}",method=RequestMethod.GET)
    public CartBook findOne(@PathVariable int id){
        return cartBookRepository.findById(id).get();
    }
    //create
    @RequestMapping(value="/cartBook", method=RequestMethod.POST)
    public String create(@RequestBody CartBook cartBook) {
        cartBookRepository.save(cartBook);
        return "{\"code\":200}";
    }
    //update
    @RequestMapping(value="/cartBook",method=RequestMethod.PUT)
    public CartBook update(@RequestBody CartBook cartBook) {
        cartBookRepository.save(cartBook);
        return cartBook;
    }
    //delete
    @RequestMapping(value="/cartBook/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        cartBookRepository.deleteById(id);
        return "{\"code\":200}";
    }
    
}