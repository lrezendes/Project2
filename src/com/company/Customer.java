package com.company;

import java.util.ArrayList;

public class Customer {
    private int CustomerID;
    private String name;
    private ArrayList<ShippingAddress> Addresses;

    public Customer(String customerName, int ID){
        name = customerName;
        CustomerID = ID;
    }

    public void addAddress (ShippingAddress newAddress){
        Addresses.add(newAddress);

    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + " " + CustomerID;
    }
}
