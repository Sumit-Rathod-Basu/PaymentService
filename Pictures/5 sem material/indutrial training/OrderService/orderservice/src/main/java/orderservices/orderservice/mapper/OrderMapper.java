package orderservices.orderservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import orderservices.orderservice.dto.Orderdto;
import orderservices.orderservice.model.Order;

@Mapper(componentModel = "spring")
@Component
public interface OrderMapper {

       public  Order toOrder(Orderdto dto);
       public Orderdto todto(Order order1);
       public List<Orderdto> todto(List<Order> order);
}
