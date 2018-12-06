package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.Promotion;
import insat.ecommerce.dal.repository.PromotionRepository;

@RestController
public class PromotionController {

    //repositories
    @Autowired
    PromotionRepository promotionRepository;

    //methods

    //find all
    @RequestMapping(value = "/promotion", method = RequestMethod.GET)
    public List<Promotion> findAll() {
        return (List<Promotion>) promotionRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/promotion/{id}", method=RequestMethod.GET)
    public Promotion findOne(@PathVariable int id) {
        return promotionRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/promotion",method=RequestMethod.POST)
    public String create(@RequestBody Promotion promotion){
        promotionRepository.save(promotion);
        
        return "{\"code\":200}";
    }
    
    //update
    @RequestMapping(value="/promotion",method=RequestMethod.PUT)
    public Promotion update(@RequestBody Promotion promotion){
        promotionRepository.save(promotion);
        return promotion;
    }

    //delete
    @RequestMapping(value="/promotion/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        promotionRepository.deleteById(id);
        
        return "{\"code\":200}";
    }

}