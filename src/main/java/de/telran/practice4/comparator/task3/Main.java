package de.telran.practice4.comparator.task3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] digits = { "O", "Z", "A", "E"};
        Arrays.sort(digits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String digit: digits) {
            System.out.println(digit);
        }
        System.out.println(digits.toString());

        System.out.println(Arrays.toString(digits));
    }

}
