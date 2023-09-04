package de.telran.practice3.interfaces.task1;

public interface Fly {
    default BirdType getKindOfBird (){
        return BirdType.FLYING;
    }
    void fly();
}
