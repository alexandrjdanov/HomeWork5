package EShop;

public class User extends Basket {

    String login;
    String password;

    public User(String login, String password, String [] purchasedProducts) {
        super(purchasedProducts);
        this.login = login;
        this.password = password;
    }

    public String toString() {
        System.out.print("Login - " + login + "\n" + "Password - " + password + "\n");
        showProducts();
        return null;
    }
}