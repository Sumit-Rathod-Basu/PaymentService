package orderservice.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orderdto {
    
    private Long Id;
    private String productId;
    private int quantity;
    private String customerName;
    private String customerAddress;
    private String orderStatus;
}
