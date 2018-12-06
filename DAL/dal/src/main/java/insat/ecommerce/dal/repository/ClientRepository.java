package insat.ecommerce.dal.repository;

import org.springframework.data.repository.CrudRepository;

import insat.ecommerce.dal.model.Client;

public interface ClientRepository extends CrudRepository<Client,Integer> {

    
}