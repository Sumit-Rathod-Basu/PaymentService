package orderservice.orderservice.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import orderservice.orderservice.Service.OrderService;
import orderservice.orderservice.dto.Orderdto;
import orderservice.orderservice.dto.Orderrequest;
import orderservice.orderservice.dto.Orderresponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class OrderController {

     @Autowired
    private OrderService orderService;

    @PostMapping("/save/new/order")
    public Orderresponse postMethodName(@RequestBody Orderrequest entity) {
        //TODO: process POST request
        Orderresponse savedOrder = orderService.createOrder(entity);
        return savedOrder;
    }

    @GetMapping("/get/order/{id}")
    public Orderdto getdata(@PathVariable  Long id) {
        return orderService.getOrderById(id);
    }
    
    
    
}
