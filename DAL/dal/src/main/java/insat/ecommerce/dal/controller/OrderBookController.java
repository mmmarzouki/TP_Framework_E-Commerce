package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.OrderBook;
import insat.ecommerce.dal.repository.OrderBookRepository;

@RestController
public class OrderBookController {

    //repositories
    @Autowired
    OrderBookRepository orderBookRepository;

    //methods

    //find all
    @RequestMapping(value = "/orderBook", method = RequestMethod.GET)
    public List<OrderBook> findAll() {
        return (List<OrderBook>) orderBookRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/orderBook/{id}", method=RequestMethod.GET)
    public OrderBook findOne(@PathVariable int id) {
        return orderBookRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/orderBook",method=RequestMethod.POST)
    public String create(@RequestBody OrderBook orderBook){
        orderBookRepository.save(orderBook);
        
        return "{\"code\":200}";
    }
    
    //update
    @RequestMapping(value="/orderBook",method=RequestMethod.PUT)
    public OrderBook update(@RequestBody OrderBook orderBook){
        orderBookRepository.save(orderBook);
        return orderBook;
    }

    //delete
    @RequestMapping(value="/orderBook/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        orderBookRepository.deleteById(id);
        
        return "{\"code\":200}";
    }

}