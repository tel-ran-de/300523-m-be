package de.telran.practice4.comparator.task2;

import java.util.Comparator;

public class PersonNameAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int nameCompare = person1.getName().compareTo(person2.getName());
        int yearCompare = person1.getAge() - person2.getAge();

        return nameCompare == 0 ? yearCompare : nameCompare;
    }
}
