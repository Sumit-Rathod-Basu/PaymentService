package mapstruct.mapstructdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import mapstruct.mapstructdemo.Service.OrderService;
import mapstruct.mapstructdemo.dto.Orderdto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/add")
public class OrderController {


    @Autowired
    private OrderService orderService;

    @PostMapping("/add/order")
    public Orderdto postMethodName(@RequestBody Orderdto entity) {
        //TODO: process POST request
        
        return orderService.createOrder(entity);
    }
    @GetMapping("/getdata/{param}")
    public Orderdto getMethodName(@PathVariable Long param) {
        return orderService.getOrderById(param);
    }

    /* @GetMapping("/getdata")
    public List<Orderdto> getAllData() {
        return orderService.getOrderById();
    }
     */
    
}
