package Users;

public class User {
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
