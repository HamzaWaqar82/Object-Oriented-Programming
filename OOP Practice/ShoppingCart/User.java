package ShoppingCart;

public class User {
    String fullName = "null";
    String email = "null";
    String address =  "null";

    public User(){

    }
    public User(String fullName, String email,String address){
        this.fullName = fullName;
        this.email = email;
        this.address = address;
    }

    public void displayUserDetails(){
        System.out.println(this.fullName);
        System.out.println(this.email );
        System.out.println(this.address);
    }

    
}
