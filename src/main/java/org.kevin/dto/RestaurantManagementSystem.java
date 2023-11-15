package org.kevin.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
public class RestaurantManagementSystem {
    private Combo[] combos;
    private static final int MAX_COMBO_NUM = 20;
    private int comboNum = 0;

    public RestaurantManagementSystem() {
        this.combos = new Combo[MAX_COMBO_NUM];
    }

    public void addCombo(Combo combo) {
        if (comboNum < MAX_COMBO_NUM) {
            combos[comboNum] = combo;
        } else {
            // reach the cap
            System.out.printf("There are %d combos already, add combo failed", MAX_COMBO_NUM);
        }
    }

    public String toString() {
        String combosStr = "[";
        for (Combo combo : combos) {
            if (combo != null) {
                combosStr += combo + ", ";
            }
        }
        combosStr += "]";

        return "RestaurantManagementSystem{" +
                "combos=" + combosStr +
                '}';
    }
}
