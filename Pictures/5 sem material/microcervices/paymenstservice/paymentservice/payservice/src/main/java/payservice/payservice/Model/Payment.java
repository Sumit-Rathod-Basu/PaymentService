package payservice.payservice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
public class Payment {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String paymentMethod;
    private String paymentStatus;
    private double amount;
}
