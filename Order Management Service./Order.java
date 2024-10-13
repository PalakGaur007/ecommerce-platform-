import javax.persistence.*;  
  
@Entity  
public class Order {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    private Long userId;  
    private Long productId;  
    private Integer quantity;  
    private Double totalPrice;  
  
    // getters and setters  
}  
