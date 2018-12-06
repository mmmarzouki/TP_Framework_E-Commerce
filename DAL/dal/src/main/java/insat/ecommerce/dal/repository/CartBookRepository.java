package insat.ecommerce.dal.repository;

import org.springframework.data.repository.CrudRepository;

import insat.ecommerce.dal.model.CartBook;

public interface CartBookRepository extends CrudRepository<CartBook,Integer> {

    
}