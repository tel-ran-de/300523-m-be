package de.telran.practice3.interfaces.task1;

public class Straus extends Bird implements Swim{
    @Override
    public void swim() {
        System.out.println("Straus swimming");
    }

    @Override
    void cry() {
        System.out.println("Straus cry - kurlik kurlik");
    }
}
