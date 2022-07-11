package EShop;

import java.util.Arrays;

public class Basket {
    String [] purchasedProducts;

    public Basket(String [] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    void showProducts() {
        for (int i = 0; i < purchasedProducts.length; i++)
            System.out.println("List of purchased goods: " + purchasedProducts[i]);
    }
}