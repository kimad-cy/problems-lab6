package problem2;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Customer>  customers = new ArrayList<>();
    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }
    public void addCustomer(Customer c){
        boolean alreadyIn = false;
        for(int i = 0; i<customers.size(); i++){
            if(customers.get(i).name.equals(c.name)){
                alreadyIn = true;
                System.out.println("Customer "+ c.name+ " already exists!");
            }
        }
        if(!alreadyIn){
            customers.add(c);
        }
    }

    public void addTransaction(Customer c, double amount){
        for(int i = 0; i<customers.size(); i++){
            if(customers.get(i).name.equals(c.name)){
                customers.get(i).transactions.add(amount);
            }
        }
    }
    public void printCustomers(){
        System.out.println("Customers of " + this.name);
        for(int i = 0; i<customers.size(); i++){
            System.out.println("Customer: " + (i+1));
            System.out.println("Name: " + customers.get(i).name);
            System.out.println("Transactions: " + customers.get(i).transactions);
        }
    }
}
