package de.telran.practice4.comparator.task1;

public class House implements Comparable<House>{

    private int number;
    private int area;
    private int price;

    private String city;

    public House(int number, int area, int price, String city) {
        this.number = number;
        this.area = area;
        this.price = price;
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", square=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(House o) {
        return Integer.compare(this.area, o.area);
    }
}
