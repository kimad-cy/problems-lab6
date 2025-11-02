package problem2;

import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Double> transactions = new ArrayList<>();
    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

}
