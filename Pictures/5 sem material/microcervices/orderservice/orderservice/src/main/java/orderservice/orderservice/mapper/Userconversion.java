package orderservice.orderservice.mapper;

import org.mapstruct.Mapper;

import orderservice.orderservice.dto.Orderdto;
import orderservice.orderservice.dto.Orderrequest;
import orderservice.orderservice.model.Ordermodel;

@Mapper(componentModel = "spring")
public interface Userconversion{

      Ordermodel toModel(Orderdto orderrequest);
      Orderdto toDto(Ordermodel ordermodel);
      Orderrequest toRequest(Orderdto orderdto);
     // Ordermodel toModel(Orderdto orderdto);
}
