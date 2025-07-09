package org.example;

import org.example.model.Apple;
import org.example.model.Food;
import org.example.model.Meat;
import org.example.model.constants.Colour;
import org.example.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.red);
        Apple greenApple = new Apple(8, 60, Colour.green);

        Food[] foods = {meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getPriceVegetarianWithoutDiscount());
    }
}