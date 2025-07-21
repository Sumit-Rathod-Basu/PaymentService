package mapstruct.mapstructdemo.Mapper;



import org.mapstruct.Mapper;

import mapstruct.mapstructdemo.Model.Ordermodel;
import mapstruct.mapstructdemo.dto.Orderdto;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Ordermodel toModel(Orderdto orderdto);

    Orderdto toDto(Ordermodel ordermodels);
}
