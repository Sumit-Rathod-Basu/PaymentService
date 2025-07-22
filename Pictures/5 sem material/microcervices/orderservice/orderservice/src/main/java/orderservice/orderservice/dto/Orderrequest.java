package orderservice.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orderrequest {
   
    
     private Orderdto orderdto;
     private Paydto paydto;
    
}
