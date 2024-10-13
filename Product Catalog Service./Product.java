import javax.persistence.*;  
  
@Entity  
public class Product {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    private String name;  
    private String description;  
    private Double price;  
  
    // getters and setters  
}  
