package insat.ecommerce.dal.repository;

import org.springframework.data.repository.CrudRepository;

import insat.ecommerce.dal.model.Order;

public interface OrderRepository extends CrudRepository<Order,Integer> {

    
}