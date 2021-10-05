package com.company;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;

    public Store() {
        Orders = new ArrayList<Order>();
        Customers = new ArrayList<Customer>();
    }
    public static void main(String[] args) {
        var Project2 = new Store();
        Project2.runStore();
    }
    public void runStore(){
        var inputReader = new Scanner(System.in);
        while(true){
            printMenu();
            var userChoice = inputReader.nextInt();
            switch (userChoice){
                case 1:
                    addCustomer(inputReader);
                    break;
                case 2:
                    System.out.println("What is the customer ID of the customer to select: ");
                    var idToFind = inputReader.nextInt();
                    var customer = getCustomer(idToFind);
                    if (customer.isPresent()){
                        doCustomerMenu(inputReader, customer.get());
                    }
                    else
                        System.out.println("No such customer exists at this bank")
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private void doCustomerMenu(Scanner inputReader, Customer customer) {
        while(true) {
            printCustomerMenu();
            System.out.print("Enter Selection:");
            var choice = inputReader.nextInt();
            switch (choice){
                case 1:
                    Customer addAddress = addAddressToCustomer(inputReader, customer);
                    allAccounts.add(addAddress);
                    break;
                case 2:
                    Customer makeOrder = makeOrder(inoutReader, order);
                    break;
                default:
                    System.out.println("Please choose one of the choices in the list");

            }
        }
    }

    private void addAddress(Scanner, inputReader, Customer customer){
        System.out.println("Enter ID of account to add an address:");
        var addAddress = inputReader.nextInt();
        var newAddress = customer.addAddress(newAddress(addAddress));
        if(newAddress.isPresent()){
            System.out.println("Adding address...");
            allAccounts.add(newAddress.get());
        }
    }

    private Optional<Customer> getCustomer(int CustomerID) {
        for(var currentCustomer : allCustomers);
            if(currentCustomer.getID() == CustomerID );
                return Optional.of(currentCustomer);

    }

    private void addCustomer(Scanner inputReader) {
        inputReader.nextLine();//eats \n from previous call to nextInt
        System.out.print("Enter the new Customer's name: ");
        var newCustomerName = inputReader.nextLine();
        System.out.print("Enter the new Customer's Address:");
        var newShippingAddress = inputReader.nextInt();
        var newCustomer = new Customer(newCustomerName, newShippingAddress);
        System.out.println("Success! Created new Customer with Name: "+ newCustomer.getName() +
                " and Address: ");
    }

    private void printMenu() {
        System.out.println("=========================================");
        System.out.println("What do you want to do next:");
        System.out.println("  [1] Add a Customer");
        System.out.println("  [2] Select a Customer");
        System.out.println("  [3] Exit Program");
        System.out.println("==========================================");
        System.out.println("Type the number of options you want:");
    }
}


