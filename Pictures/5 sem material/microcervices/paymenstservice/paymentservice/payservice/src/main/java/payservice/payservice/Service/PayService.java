package payservice.payservice.Service;

//import org.hibernate.query.sqm.tree.expression.Conversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import payservice.payservice.Mapper.Conversion;
import payservice.payservice.Model.Payment;
import payservice.payservice.dto.Paydto;
import payservice.payservice.repository.payrepo;

@Service
public class PayService {

    @Autowired
    private payrepo payRepository;

    @Autowired
    private Conversion conversion;

    public Paydto createPayment(Paydto paydto) {
        // Convert Paydto to Payment entity
        Payment payment = conversion.toPayment(paydto);
        Payment savedPayment = payRepository.save(payment);
        // Convert saved Payment entity back to Paydto
        return conversion.toPaydto(savedPayment);
    }
   
    public Paydto getPaymentById(Long id) {
        Payment payment = payRepository.findById(id).orElse(null);
        
        return   conversion.toPaydto(payment);
        }
}
