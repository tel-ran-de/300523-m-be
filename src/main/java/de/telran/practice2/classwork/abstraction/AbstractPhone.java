package de.telran.practice2.classwork.abstraction;

public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }
    public abstract void call(int outputNumber);
    public abstract void ring (int inputNumber);
}
