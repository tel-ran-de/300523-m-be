package de.telran.practice4.comparator.taskWithStar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final String inputString = "hfjsk6485lop";
        Character[] charObjectArray =
                inputString.chars().
                        mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(charObjectArray, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        });
        String string = Arrays.stream(charObjectArray).map(String::valueOf).collect(Collectors.joining());
        System.out.println(string);
    }
}
