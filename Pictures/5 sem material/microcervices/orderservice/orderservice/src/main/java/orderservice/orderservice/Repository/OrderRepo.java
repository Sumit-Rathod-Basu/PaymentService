package orderservice.orderservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import orderservice.orderservice.model.Ordermodel;



public interface OrderRepo extends JpaRepository<Ordermodel, Long> {

}
