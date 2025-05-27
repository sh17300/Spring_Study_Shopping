package Items;

import Products.Product;
import Users.User;
import jakarta.persistence.*;

@Entity

public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private int quantity;

    public Product getProduct() {
        return product;
    }
    public User getUser() {
        return user;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setUser(User user) {
        this.user = user;
    }

}
