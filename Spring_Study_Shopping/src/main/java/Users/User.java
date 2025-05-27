package Users;

import jakarta.persistence.Entity;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@EnableAspectJAutoProxy
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String password;
    private String email;
    private String name;

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
