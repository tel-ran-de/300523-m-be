package de.telran.practice4.comparator.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Andrei", 30);
        Person person2 = new Person("Karl", 28);
        Person person3 = new Person("Karl", 17);

        List<Person> persons = Arrays.asList(person1, person2, person3);
        PersonNameAgeComparator comparator = new PersonNameAgeComparator();
        persons.sort(comparator);

//        Comparator<Person> personComparator = Comparator.comparing(Person::getName).thenComparing(Person::getAge);
//        persons.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        for(Person person: persons){
            System.out.println(person.toString());
        }
    }
}
