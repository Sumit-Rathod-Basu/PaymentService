package mapstruct.mapstructdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orderdto {

   private Long id;
    private String orderNumber;
    private String customerName;
    private String product;
    private int quantity;
}
