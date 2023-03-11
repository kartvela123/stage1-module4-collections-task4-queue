package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> di = new ArrayList<>();
        List<Integer> ra = new ArrayList<>();

        for(int a = 1; a <= numberOfDishes; a++) {
            ra.add(a);
        }
        List<Integer> rac = new ArrayList<>(ra);
        int j = 1;
        while (di.size() != numberOfDishes) {
            for (int i = 0; i < ra.size(); i++) {
                if (j % everyDishNumberToEat == 0 ) {
                    di.add(ra.get(i));
                    rac.remove(ra.get(i));
                    j = 1;
                } else {
                    j += 1;

                }

            }
            ra = new ArrayList<>(rac);
        }
        return di;
    }
}
