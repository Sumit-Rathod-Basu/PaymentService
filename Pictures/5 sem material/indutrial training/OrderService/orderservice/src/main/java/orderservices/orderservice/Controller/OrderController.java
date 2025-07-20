package orderservices.orderservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;




import orderservices.orderservice.Service.OrderService;
import orderservices.orderservice.dto.Orderdto;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class OrderController {
        
     @Autowired
     private OrderService os;

     @PostMapping("/addOrder")
     public Orderdto saveOrder(@RequestBody Orderdto order) {
        
         return os.saveOrder1(order);
     }

     @SuppressWarnings("unchecked")
    @GetMapping("/getOrders")
     public List<Orderdto> getMethodName() {
         return os.getOrder();
     }
         
}
