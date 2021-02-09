package ru.itsjava.exercises.collection.sets.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetPractice {

    public static void main(String[] args) {
        //Создать LinkedHashSet и добавить разные элементы
        // и вывести на экран проверить, что все элементы
        // вывелись в порядке добавления

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set hashSet = new HashSet();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        System.out.println("hashSet = " + hashSet);
    }
}
