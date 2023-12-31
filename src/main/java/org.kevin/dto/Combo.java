package org.kevin.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Combo {
    private static final int MAX_DISH_NUM = 2;
    private String id;
    private String name;
    private double price;
    private static int nextId = 1;
    private Dish[] dishes;
    private Beverage[] beverages;

    public Combo(String name) {
        this.id = String.format("C%03d", nextId++);
        this.name = name;
        this.dishes = new Dish[2];
        this.beverages = new Beverage[2];
    }

    public void addDish(Dish dish) {
        if (dishes[0] == null) {
            dishes[0] = dish;
        } else if (dishes[1] == null) {
            dishes[1] = dish;
        } else {
            System.out.printf("There are already %d dishes, add dishes failed", MAX_DISH_NUM);
        }
        calcPrice(); // not sure better before, separately added to if else statements
    }

    public void addBeverage(Beverage beverage) {
        if (beverages[0] == null) {
            beverages[0] = beverage;
        } else if (beverages[1] == null) {
            beverages[1] = beverage;
        } else {
            System.out.printf("There are already %d beverages, add beverages failed", MAX_DISH_NUM);
        }
        calcPrice();
    }

    public void calcPrice() {
        double price = 0;
        for (Beverage beverage : beverages) {
            if (beverage != null) {
                price += beverage.getPrice();
            }
        }
        for (Dish dish : dishes) {
            if (dish != null) {
                price += dish.getPrice();
            }
        }

        double discountRatio = 0.8;
        this.price = discountRatio * price;
    }
}
