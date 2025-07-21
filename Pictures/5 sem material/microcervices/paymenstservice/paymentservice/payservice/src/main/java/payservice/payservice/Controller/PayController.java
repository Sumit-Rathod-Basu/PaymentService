package payservice.payservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import payservice.payservice.Service.PayService;
import payservice.payservice.dto.Paydto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class PayController {
   
    @Autowired
    private PayService payService;
    
    @PostMapping("/add/new/pay")
    public Paydto postMethodName(@RequestBody Paydto entity) {
        
        
        return  payService.createPayment(entity);
    }
    
    @GetMapping("/get/pay/{id}")
    public Paydto getMethodName(@PathVariable Long id) {
        return payService.getPaymentById(id);
    }
    
}