package de.telran.practice4.comparator.task1;

import java.util.Comparator;

public class HousePriceComparator implements Comparator<House> {


    @Override
    public int compare(House h1, House h2) {
        if (h1.getPrice() == h2.getPrice()) {
            return 0;
        }
        if (h1.getPrice() > h2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
