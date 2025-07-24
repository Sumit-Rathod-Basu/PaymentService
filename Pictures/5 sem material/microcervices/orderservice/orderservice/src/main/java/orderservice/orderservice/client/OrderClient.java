package orderservice.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import orderservice.orderservice.dto.Paydto;

@FeignClient(name = "order-client", url = "http://localhost:8282/api/pay")
public interface OrderClient {
    
    @PostMapping("/add/new/pay")
    public Paydto postMethodName(@RequestBody Paydto entity);

}
