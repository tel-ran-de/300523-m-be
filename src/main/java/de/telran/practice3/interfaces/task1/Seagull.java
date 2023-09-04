package de.telran.practice3.interfaces.task1;

public class Seagull extends Bird implements Fly {
    @Override
    void cry() {
        System.out.println("a-a-a-a-a-a-a-a");
    }

    @Override
    public void fly() {
        System.out.println("fast flight");
    }
}
