package orderservice.orderservice.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orderresponse {
    private Orderdto orderdto;
    private Paydto paydto;
}
