package ru.itsjava.exercises.collection.sets.hashset;

import ru.itsjava.model.Man;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
//        Создать 2 множества от Man, добавить несколько Man
//        и сравнить множества через equals
        Set<Man> manHashSet1 = new HashSet<>();
        Set<Man> manHashSet2 = new HashSet<>();

        manHashSet1.add(new Man("Bob","Rob"));
        manHashSet1.add(new Man("Sam","Smith"));

        manHashSet2.add(new Man("Bob","Rob"));
        manHashSet2.add(new Man("Sam","Smith"));

        System.out.println("manHashSet1.equals(manHashSet2) = " + manHashSet1.equals(manHashSet2));
    }
}
