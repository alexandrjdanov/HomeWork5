package EShop;

public class EshopDemo {

    public static void main(String[] args) {
        Category c1 = new Category("Phones", new String[]{"Xiaomi, iPhone, Samsung"});
        Category c2 = new Category("Laptops", new String[]{"ASUS, HP, Dell"});
        Category c3 = new Category("TVs", new String[]{"LG, SONY, Samsung"});
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println();
        User u1 = new User("user1", "user1pass", new String[]{"Phone Samsung, Laptop DELL, TV LG"});
        u1.toString();
    }
}