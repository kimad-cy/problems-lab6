package problem2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Customer c1 = new Customer("John Doe",new ArrayList<>());
       Customer c2 = new Customer("Jane Doe",new ArrayList<>());
       Customer c3 = new Customer("Peter Smith",new ArrayList<>());
       Bank bank = new Bank("UM6P bank", new ArrayList<>());

       System.out.println("Adding c1 to the bank.");
       System.out.println("=======================================");
       bank.addCustomer(c1);

       bank.addTransaction(c1, 50);
       bank.addTransaction(c1, 150);
       bank.addTransaction(c1, -50);

        bank.printCustomers();
        System.out.println("=======================================");

        System.out.println("Adding c2 to the bank.");
        System.out.println("=======================================");
        bank.addCustomer(c2);
       bank.addTransaction(c2, 60);
       bank.addTransaction(c2, -50);
       bank.addTransaction(c2, 30);

       bank.printCustomers();
        System.out.println("=======================================");

        System.out.println("Adding c3 to the bank.");
        System.out.println("=======================================");
        bank.addCustomer(c3);

       bank.addTransaction(c3, 30);
       bank.addTransaction(c3, 50);
       bank.addTransaction(c3, -50);

       bank.printCustomers();

       System.out.println("======================================");
       System.out.println("Adding c1 to the bank again.");
       System.out.println("======================================");
       bank.addCustomer(c1);

    }
}
