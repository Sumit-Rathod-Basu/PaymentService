package payservice.payservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paydto {
    private Long id;
    private String paymentMethod;
    private String paymentStatus;
    private double amount;

}
