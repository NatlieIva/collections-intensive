package ru.itsjava.exercises.collection.sets.immutablesets;

import java.util.*;

public class CheckSetPractice {
    public static void main(String[] args) {
//Создать HashSet с типо Object, добавить несколько элементов с типом String
// Создать обертку над ним с помощью checkedSet  с типом String.class
//добавить элемент 10

        Set hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        Set checkSet = Collections.checkedSet(hashSet, String.class);
        checkSet.add(10);// not added
        checkSet.add("10");// added

        System.out.println("checkSet = " + checkSet);
    }
}
