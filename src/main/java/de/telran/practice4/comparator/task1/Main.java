package de.telran.practice4.comparator.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        House house1 = new House(55, 1000, 1000, "Berlin");
        House house2 = new House(117, 15, 60000, "Sidney");
        House house3 = new House(14, 46, 450, "Jakarta");
        House house4 = new House(28, 480, 700, "Tokio");

        House[] houses = {house1, house2, house3, house4};
        Arrays.sort(houses);

        for (House h : houses) {
            System.out.println(h);
        }
        HousePriceComparator housePriceComparator = new HousePriceComparator();
        Arrays.sort(houses, housePriceComparator);

        System.out.println("\n" + "Sort after comparator: ");
        for (House h : houses) {
            System.out.println(h);
        }
    }
}
