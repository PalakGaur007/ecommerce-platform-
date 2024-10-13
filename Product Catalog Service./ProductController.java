import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
  
import java.util.List;  
  
@RestController  
@RequestMapping("/products")  
public class ProductController {  
    @Autowired  
    private ProductService productService;  
  
    @PostMapping  
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {  
        Product savedProduct = productService.saveProduct(product);  
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);  
    }  
  
    @GetMapping  
    public ResponseEntity<List<Product>> getAllProducts() {  
        List<Product> products = productService.getAllProducts();  
        return ResponseEntity.ok(products);  
    }  
}  
