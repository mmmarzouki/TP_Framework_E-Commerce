package insat.ecommerce.dal.repository;

import org.springframework.data.repository.CrudRepository;

import insat.ecommerce.dal.model.Cart;

public interface CartRepository extends CrudRepository<Cart,Integer> {

    
}