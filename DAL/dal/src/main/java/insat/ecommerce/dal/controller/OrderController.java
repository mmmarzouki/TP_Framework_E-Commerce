package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.Order;
import insat.ecommerce.dal.repository.OrderRepository;

@RestController
public class OrderController {

    //repositories
    @Autowired
    OrderRepository orderRepository;

    //methods

    //find all
    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public List<Order> findAll() {
        return (List<Order>) orderRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/order/{id}", method=RequestMethod.GET)
    public Order findOne(@PathVariable int id) {
        return orderRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/order",method=RequestMethod.POST)
    public String create(@RequestBody Order order){
        orderRepository.save(order);
        
        return "{\"code\":200}";
    }
    
    //update
    @RequestMapping(value="/order",method=RequestMethod.PUT)
    public Order update(@RequestBody Order order){
        orderRepository.save(order);
        return order;
    }

    //delete
    @RequestMapping(value="/order/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        orderRepository.deleteById(id);
        
        return "{\"code\":200}";
    }

}