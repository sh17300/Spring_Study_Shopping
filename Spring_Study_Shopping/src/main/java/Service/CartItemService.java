package Service;

import Items.CartItem;
import Products.Product;
import Repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartItemService {
    private final CartItemRepository cartItemRepository;

    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
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
}
