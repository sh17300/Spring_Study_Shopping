package Products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int stock_quantity;
    private int price;

    //getter
    public String getName() {return name;}
    public Long getId() {return id;}
    public int getStock_quantity() {return stock_quantity;}
    public int getPrice() {return price;}

    //setter
    public void setName(String name) {this.name = name;}
    public void setId(Long id) {this.id = id;}
    public void setStock_quantity(int stock_quantity) {this.stock_quantity = stock_quantity;}
    public void setPrice(int price) {this.price = price;}
}
