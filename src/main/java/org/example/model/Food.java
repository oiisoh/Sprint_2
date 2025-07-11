package org.example.model;

import org.example.model.constants.Discount;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return Discount.ZERO;
    }
    public int getAmount(){
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }
}
