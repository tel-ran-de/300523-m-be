package de.telran.practice4.comparable.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        House house1 = new House(4, 100, 1000, "Berlin");
        House house2 = new House(4, 112, 60000, "Sidney");
        House house3 = new House(1, 160, 450, "Jakarta");
        House house4 = new House(1, 13335, 700, "Tokio");

        House[] houses = {house1, house2, house3, house4};
        Arrays.sort(houses); // or Collections.sort(houses);

        for (House house : houses) {
            System.out.println(house);
        }
    }
}
