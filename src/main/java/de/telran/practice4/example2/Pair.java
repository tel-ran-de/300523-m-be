package de.telran.practice4.example2;

public class Pair implements Comparable<Pair> {
    String firstName;
    String lastName;

    public Pair(String x, String y) {
        this.firstName = x;
        this.lastName = y;
    }

    public String toString() {
        return "( " + firstName + " , " + lastName + " )";
    }

    @Override
    public int compareTo(Pair a) {
        // if the string are not equal
        if (this.firstName.compareTo(a.firstName) != 0) {
            return this.firstName.compareTo(a.firstName);
        } else {
            // we compare lastName if firstNames are equal
            return this.lastName.compareTo(a.lastName);
        }
    }
}
