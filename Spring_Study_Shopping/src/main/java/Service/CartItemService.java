package Service;

import Items.CartItem;
import Products.Product;
import Repository.CartItemRepository;
import Repository.UserRepository;
import Users.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartItemService {
    private final CartItemRepository cartItemRepository;
    private final UserRepository userRepository;

    public CartItemService(CartItemRepository cartItemRepository, UserRepository userRepository) {
        this.cartItemRepository = cartItemRepository;
        this.userRepository = userRepository;
    }

    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> findAll(){
        return cartItemRepository.findAll();
    }
    public CartItem findById(Long id) {
        return cartItemRepository.findById(id).orElseThrow(() -> new RuntimeException("상품 없음"));
    }

    public CartItem saveCartItem(CartItem cartItem, Long userId) {
        User user = userRepository.findById(userId) .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));
        cartItem.setUser(user);
        return cartItemRepository.save(cartItem);
    }
}
