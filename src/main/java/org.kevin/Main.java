package org.kevin;

import org.kevin.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem1 = new RestaurantManagementSystem();
        System.out.println(restaurantManagementSystem1);

        Dish frenchFries = new Dish("French Fries", 3, FoodType.VEGGIE);
        Beverage pepsi = new Beverage("pepsi", 1, false);
        Combo friesPepsi = new Combo("Fries & pepsi");
        friesPepsi.addDish(frenchFries);
        friesPepsi.addBeverage(pepsi);

        restaurantManagementSystem1.addCombo(friesPepsi);
        System.out.println(restaurantManagementSystem1);
    }


}
