package insat.ecommerce.dal.repository;

import org.springframework.data.repository.CrudRepository;

import insat.ecommerce.dal.model.OrderBook;

public interface OrderBookRepository extends CrudRepository<OrderBook,Integer> {

    
}