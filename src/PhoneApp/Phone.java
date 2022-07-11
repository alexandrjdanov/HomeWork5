package PhoneApp;

public class Phone {
    String model;
    double weight;
    String number;

    public Phone() {
    }


    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Model: " + model + "\n" +
                "Number: " + number + "\n" +
                "Weight: " + weight + "\n";
    }

    void receiveCall(String incomeName) {
        System.out.println("Income call from: " + incomeName);
    }

    void receiveCall(String incomeName, String incomeNumber) {
        System.out.println("Income call from: " + incomeName + " " + incomeNumber);
    }

    void getNumber(String incomeNumber) {
        System.out.println("Income call from number: " + incomeNumber);
    }

    void sendMessage(String...phoneNumber) {
        System.out.print("The message will be sent to this number(s): " );
        for (int i = 0; i < phoneNumber.length; i++) {
            System.out.print(phoneNumber[i] + "\t");
        }
    }
}
