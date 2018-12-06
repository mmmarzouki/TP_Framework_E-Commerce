package insat.ecommerce.dal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import insat.ecommerce.dal.model.Client;
import insat.ecommerce.dal.repository.ClientRepository;

@RestController
public class ClientController {

    
    //repositories
    @Autowired
    ClientRepository clientRepository;

    //methods

    //find all
    @RequestMapping(value="/client", method=RequestMethod.GET)
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }
    
    //find one
    @RequestMapping(value="/client/{id}", method=RequestMethod.GET)
    public Client findOne(@PathVariable int id) {
        return clientRepository.findById(id).get();
    }
    
    //create
    @RequestMapping(value="/client",method=RequestMethod.POST)
    public String create(@RequestBody Client client){
        clientRepository.save(client);
        
        return "{\"code\":200}";
    }
    
    //update
    @RequestMapping(value="/client",method=RequestMethod.PUT)
    public Client update(@RequestBody Client client){
        clientRepository.save(client);
        return client;
    }

    //delete
    @RequestMapping(value="/client/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable int id){
        clientRepository.deleteById(id);
        
        return "{\"code\":200}";
    }

}