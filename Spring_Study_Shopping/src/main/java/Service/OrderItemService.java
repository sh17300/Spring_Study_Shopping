package Service;


import Items.CartItem;
import Items.OrderItem;
import Repository.OrderItemRepository;

import java.util.List;

public class OrderItemService {
    private final OrderItemRepository repository;

    public OrderItemService(OrderItemRepository repository) {
        this.repository = repository;
    }

    public OrderItem save(OrderItem orderItem) {
        return repository.save(orderItem);
    }

    public List<OrderItem> findAll(){
        return repository.findAll();
    }
    public OrderItem findById(Long id) {
        return repository.findById(Math.toIntExact(id)).orElseThrow(() -> new RuntimeException("상품 없음"));
    }
}
