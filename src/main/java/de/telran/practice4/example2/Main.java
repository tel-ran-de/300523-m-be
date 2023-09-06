package de.telran.practice4.example2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        Pair arr[] = new Pair[n];
        arr[0] = new Pair("raj", "kashup");
        arr[1] = new Pair("rahul", "singh");
        arr[2] = new Pair("reshmi", "dubey");
        arr[3] = new Pair("rahul", "jetli");

        // Sorting the array
        Arrays.sort(arr);

        // printing the
        // Pair array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
