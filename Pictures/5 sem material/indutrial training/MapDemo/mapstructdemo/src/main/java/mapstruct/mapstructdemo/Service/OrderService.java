package mapstruct.mapstructdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapstruct.mapstructdemo.Mapper.OrderMapper;
import mapstruct.mapstructdemo.Model.Ordermodel;
import mapstruct.mapstructdemo.Repository.orderRepo;
import mapstruct.mapstructdemo.dto.Orderdto;

@Service
public class OrderService 
{
     
      @Autowired
        private OrderMapper orderMapper;

      @Autowired
        private orderRepo orderRepository;

      public Orderdto createOrder( Orderdto orderdto) 
      {
        
        Ordermodel  or=orderMapper.toModel(orderdto);
        Ordermodel savedOrder = orderRepository.save(or);
        Orderdto dto = orderMapper.toDto(savedOrder);
        return dto;
      }

      public Orderdto getOrderById(Long  id)
        {   
         
            Ordermodel ordermodel = orderRepository.findById(id).orElse(null);
            return orderMapper.toDto(ordermodel);

        }

       /*  public List<Orderdto> getOrderById()
        {
            List<Ordermodel> ordermodels = orderRepository.findAll();
           // return (List<Orderdto>) orderMapper.toD(ordermodels);
           return null;

        } */
}
