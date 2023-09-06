package de.telran.practice4.example1;

public class Pair implements Comparable <Pair>
{
    String x;
    int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        if (this.x.compareTo(o.x) != 0) {
            return this.x.compareTo(o.x);
        }
        else {
            // we compare int values
            // if the strings are equal
            return this.y - o.y;
        }
    }

    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
