package orderservices.orderservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import orderservices.orderservice.dto.Orderdto;
import orderservices.orderservice.mapper.OrderMapper;
import orderservices.orderservice.model.Order;
import orderservices.orderservice.repository.OrderRepo;

@Service
@ComponentScan(basePackages={"orderservices.orderservice.mapper"})
public class OrderService implements Services  
{


     @Autowired
     private OrderRepo  or;

     @Autowired
     private  OrderMapper  orderMapper;
    @Override 
    public Orderdto saveOrder1(Orderdto data) {

      Order order=orderMapper.toOrder(data);

      Order order1=or.save(order);
      Orderdto orderdto=orderMapper.todto(order1);
      return  orderdto;
    }

@Override
public List getOrder() {
   List <Order> order=(List<Order>) or.findAll();
    return order;
    
}


}
