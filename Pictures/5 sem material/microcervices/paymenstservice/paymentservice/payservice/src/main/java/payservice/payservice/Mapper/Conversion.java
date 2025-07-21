package payservice.payservice.Mapper;

import org.mapstruct.Mapper;
import payservice.payservice.dto.Paydto;
import payservice.payservice.Model.Payment;

@Mapper(componentModel = "spring")
public interface Conversion {

        Payment  toPayment(Paydto paydto);
        Paydto toPaydto(Payment payment);
}
