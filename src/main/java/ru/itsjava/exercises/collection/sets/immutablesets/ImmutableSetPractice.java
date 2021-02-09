package ru.itsjava.exercises.collection.sets.immutablesets;

import java.util.*;

public class ImmutableSetPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptySet()
//Проверить можно ли добавить туда элемент? - no
        Set emptySet = Collections.emptySet();
//        emptySet.add("hello");

//Создать список с помощью метода singleton()
//Проверить можно ли добавить туда элемент? -no
        Set singletonSet = Collections.singleton("hello");
//        singletonSet.add("add?");
//Создать копию списка с помощью метода copyOf()
//Проверить можно ли добавить туда элемент? - no
        Set copyOfSet = Set.copyOf(singletonSet);
//        copyOfSet.add("add?");
        Set newSet = new HashSet();
        newSet.add("Hi");
        Set copyOfNewSet = Set.copyOf(newSet);
//        copyOfSet.add("add?");

//Создать копию списка с помощью метода unmodifiableSet()
//Проверить можно ли добавить туда элемент? -no
//Проверить можно ли добавить в исходный список элемент? -yes
        Set unmodifiableSet = Collections.unmodifiableSet(newSet);
//        unmodifiableSet.add("add?");
        newSet.add("add?");

    }
}
