package orderservices.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import orderservices.orderservice.model.Order;

public interface OrderRepo extends JpaRepository<Order,Long> {

}
