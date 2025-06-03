package Users;

import Items.CartItem;
import Order.Order;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;


//@EnableAspectJAutoProxy
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String password;
    private String email;
    private String name;

    @OneToMany(mappedBy="user")
    private List<CartItem> cartItems = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    //getter
    public String getId() {return id;}
    public String getPassword() {return password;}
    public String getEmail() {return email;}
    public String getName() {return name;}

    //setter
    public void setid(String id) {this.id=id;}
    public void setPassword(String password) {this.password=password;}
    public void setEmail(String email) {this.email=email;}
    public void setName(String name) {this.name = name;}
}
