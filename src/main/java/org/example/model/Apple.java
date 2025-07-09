package org.example.model;

public class Apple extends Food{
    String colour;
    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals("red")) {
            return 60;
        } else {
            return super.getDiscount();
        }
    }
}

