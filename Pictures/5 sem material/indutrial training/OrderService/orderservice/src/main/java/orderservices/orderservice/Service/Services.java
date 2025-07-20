package orderservices.orderservice.Service;

import java.util.List;

import orderservices.orderservice.dto.Orderdto;
import orderservices.orderservice.model.Order;

public interface Services {
   public Orderdto saveOrder1(Orderdto data);
   public List<Order> getOrder();
}
