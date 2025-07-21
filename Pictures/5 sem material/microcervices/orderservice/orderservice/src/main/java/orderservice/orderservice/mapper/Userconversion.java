package orderservice.orderservice.mapper;

import org.mapstruct.Mapper;

import orderservice.orderservice.dto.Orderdto;
import orderservice.orderservice.model.Ordermodel;

@Mapper(componentModel = "spring")
public interface Userconversion{

      Ordermodel toModel(Orderdto orderdto);
      Orderdto toDto(Ordermodel ordermodel);
}
