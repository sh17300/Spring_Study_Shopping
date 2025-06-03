package Controller;

import Items.CartItem;
import Products.Product;
import Repository.CartItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cartitems")
public class CartItemController {
    private final CartItemRepository cartItemRepository;
    
    public CartItemController(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }
    
    @PostMapping
    public void createCartItem(@RequestBody CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }
    @GetMapping
    public List<CartItem> findAll() {
        return cartItemRepository.findAll();
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<CartItem>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(cartItemRepository.findById(id));
    }
}
