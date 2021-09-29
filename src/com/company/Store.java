package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;

    public Store() {
        Orders = new ArrayList<Order>();
        Customers = new ArrayList<Customer>();
    }
    public static void main(String[] args) {

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
                    selectCustomer(inputReader);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private void selectCustomer(Scanner inputReader) {

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


