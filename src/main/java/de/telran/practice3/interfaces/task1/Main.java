package de.telran.practice3.interfaces.task1;

public class Main {
    public static void main(String[] args) {
        Straus straus = new Straus();
        Seagull seagull = new Seagull();

        straus.cry();
        straus.swim();
        straus.getKindOfBird();

        seagull.cry();
        seagull.fly();
        seagull.getKindOfBird();
    }
}
