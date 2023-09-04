package de.telran.practice3.interfaces.task1;

public interface Swim {

    default BirdType getKindOfBird() {
        return BirdType.SWIMMING;
    }

    void swim();
}
