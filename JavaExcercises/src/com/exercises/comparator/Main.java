package com.exercises.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 45));
        people.add(new Person("Charlie", 25));
        people.add(new Person("Dave", 35));

        // Sort the list using PersonComparator
        Collections.sort(people, new PersonComparator());

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
