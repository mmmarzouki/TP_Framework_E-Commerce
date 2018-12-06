package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.Cart;
import insat.ecommerce.dal.repository.CartRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class CartController {

    //repositories
    @Autowired
    CartRepository cartRepository;

    //methods

    //find all
    @RequestMapping(value="/cart", method=RequestMethod.GET)
    public List<Cart> findAll() {
        return (List<Cart>) cartRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/cart/{id}", method=RequestMethod.GET)
    public Cart findOne(@PathVariable int id) {
        return cartRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/cart",method=RequestMethod.POST)
    public String create(@RequestBody Cart cart){
        cartRepository.save(cart);
        
        return "{\"code\":200}";
    }
    
    //update
    @RequestMapping(value="/cart",method=RequestMethod.PUT)
    public Cart update(@RequestBody Cart cart){
        cartRepository.save(cart);
        return cart;
    }

    //delete
    @RequestMapping(value="/cart/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        cartRepository.deleteById(id);
        
        return "{\"code\":200}";
    }

}