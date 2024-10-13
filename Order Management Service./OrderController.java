import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
  
import java.util.List;  
  
@RestController  
@RequestMapping("/orders")  
public class OrderController {  
    @Autowired  
    private OrderService orderService;  
  
    @PostMapping  
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {  
        Order savedOrder = orderService.saveOrder(order);  
        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);  
    }  
  
    @GetMapping  
    public ResponseEntity<List<Order>> getAllOrders() {  
        List<Order> orders = orderService.getAllOrders();  
        return ResponseEntity.ok(orders);  
    }  
}  
