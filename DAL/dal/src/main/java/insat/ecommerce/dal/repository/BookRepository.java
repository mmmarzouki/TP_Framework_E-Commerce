package insat.ecommerce.dal.repository;

import org.springframework.data.repository.CrudRepository;

import insat.ecommerce.dal.model.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

    
}