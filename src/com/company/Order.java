package com.company;

public class Order {
    private ShippingAddress destination;
    private Customer orderedBy;

    public String getDestination() {
        return destination;

    public String getOrderer(){
        return orderedBy.getName();
        }

    public Order(ShippingAddress dest, Customer cust){
        destination = dest;
        orderedBy = cust;
        }

    }
}
