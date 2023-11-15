package org.kevin.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Beverage {
    private String id;
    private String name;
    private double price;
    private static int nextId = 1;
    private boolean containsAlcohol;

    public Beverage(String name, double price, boolean containsAlcohol) {
        this.id = String.format("B%03d", nextId++);
        this.name = name;
        this.price = price;
        this.containsAlcohol = containsAlcohol;
    }
}
