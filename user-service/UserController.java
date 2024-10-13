import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.HttpStatus;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
  
@RestController  
@RequestMapping("/users")  
public class UserController {  
    @Autowired  
    private UserService userService;  
  
    @PostMapping("/register")  
    public ResponseEntity<User> registerUser(@RequestBody User user) {  
        User savedUser = userService.saveUser(user);  
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);  
    }  
  
    @GetMapping("/{username}")  
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {  
        User user = userService.getUserByUsername(username);  
        return ResponseEntity.ok(user);  
    }  
}  
