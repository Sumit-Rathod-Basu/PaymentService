package orderservice.orderservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import orderservice.orderservice.Repository.OrderRepo;
import orderservice.orderservice.client.OrderClient;
import orderservice.orderservice.dto.Orderdto;
import orderservice.orderservice.dto.Orderrequest;
import orderservice.orderservice.dto.Orderresponse;
import orderservice.orderservice.dto.Paydto;
import orderservice.orderservice.mapper.Userconversion;
import orderservice.orderservice.model.Ordermodel;

@Service
public class OrderService {
       
    @Autowired
    private Userconversion userConversion;

    @Autowired
    private OrderRepo orderRepository; // Assuming you have an OrderRepository for database operations

   // @Autowired
    //private RestTemplate restTemplate; 
    
    @Autowired
    private OrderClient orderClient;// Assuming you are using RestTemplate for external API calls
    
    public Orderresponse createOrder(Orderrequest order) {
        // Logic to create an order
         Ordermodel orderModel =userConversion.toModel(order.getOrderdto());
         Ordermodel savedOrder = orderRepository.save(orderModel);
         Orderdto  orderdto =userConversion.toDto(savedOrder);
          // Orderrequest orderRequest = userConversion.toRequest(orderdto);
         //String paymentUrl = "http://localhost:8282/add/new/pay";
       Paydto response =orderClient.postMethodName(order.getPaydto());
         return new Orderresponse(orderdto,response);
        //return new Orderresponse(orderdto,response.getBody()); // This should ideally save the order to the database and return the saved entity
    }
    public Orderdto getOrderById(Long id) {
        Ordermodel orderModel = orderRepository.findById(id).orElse(null);
        return userConversion.toDto(orderModel);
    }
}
