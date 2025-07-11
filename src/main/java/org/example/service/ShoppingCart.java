package org.example.service;

import org.example.model.Food;

public class ShoppingCart {
    private Food[] foods;
    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }
    public double getPriceWithoutDiscount(){
        double totalPrice = 0;
        for (int i = 0; i< foods.length; i++){
           Food food = foods[i];
           totalPrice += food.getPrice() * food.getAmount();
        }
        return totalPrice;
    }
    public double getPriceWithDiscount(){
        double totalPrice = 0;
        for (int i = 0; i< foods.length; i++){
            Food food = foods[i];
            totalPrice += food.getPrice() * food.getAmount()*(100-food.getDiscount())/100;
        }
        return totalPrice;
    }
    public double getPriceVegetarianWithoutDiscount(){
        double totalPrice = 0;
        for (int i = 0; i< foods.length; i++){
            Food food = foods[i];
            if (food.getIsVegetarian()) {
                totalPrice += food.getPrice() * food.getAmount();
            }
        }
        return totalPrice;
    }
}
