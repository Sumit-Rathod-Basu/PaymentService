package orderservice.orderservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orderservice.orderservice.Repository.OrderRepo;
import orderservice.orderservice.dto.Orderdto;
import orderservice.orderservice.mapper.Userconversion;
import orderservice.orderservice.model.Ordermodel;

@Service
public class OrderService {
       
    @Autowired
    private Userconversion userConversion;

    @Autowired
    private OrderRepo orderRepository; // Assuming you have an OrderRepository for database operations
    
    public Orderdto createOrder(Orderdto order) {
        // Logic to create an order
         Ordermodel orderModel =userConversion.toModel(order);
         Ordermodel savedOrder = orderRepository.save(orderModel);
         Orderdto  orderdto =userConversion.toDto(savedOrder);
          // Save the order to the database 
        return orderdto; // This should ideally save the order to the database and return the saved entity
    }
    public Orderdto getOrderById(Long id) {
        Ordermodel orderModel = orderRepository.findById(id).orElse(null);
        return userConversion.toDto(orderModel);
           
    }
}
