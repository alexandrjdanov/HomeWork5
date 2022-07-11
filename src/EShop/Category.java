package EShop;

import java.util.Arrays;

public class Category {

    String name;
    String[] products;

    @Override
    public String toString() {
        return "Category: " + name + '\'' +
                ", Products: " + Arrays.toString(products);
    }

    public Category(String name, String[] products) {
        this.name = name;
        this.products = products;
    }
}