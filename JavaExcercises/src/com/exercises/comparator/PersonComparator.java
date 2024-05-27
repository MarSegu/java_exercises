package com.exercises.comparator;

import java.util.Comparator;

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // First compare by age
        int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        }
        // If ages are the same, compare by name
        return p1.getName().compareTo(p2.getName());
    }
}