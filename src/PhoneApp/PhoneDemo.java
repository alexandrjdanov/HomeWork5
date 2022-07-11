package PhoneApp;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone iphone = new Phone("iPhone 13 Pro Max", "067777777", 0.250);
        Phone samsung = new Phone("Samsung Galaxy S21 Ultra", "065555555", 0.300);
        Phone xiaomi = new Phone("Xiaomi Redmi Note 10 Pro", "063333333", 0.350);
        Phone google = new Phone("Google Pixel 6", "061212121");

        System.out.println(iphone.toString());
        System.out.println(samsung.toString());
        System.out.println(xiaomi.toString());
        System.out.println(google.toString());

        iphone.receiveCall("John");
        iphone.getNumber("061111111");
        System.out.println();
        iphone.receiveCall("Paul", "061234567");
        System.out.println();
        iphone.sendMessage("061414141", "061212121", "061313131");
    }
}
