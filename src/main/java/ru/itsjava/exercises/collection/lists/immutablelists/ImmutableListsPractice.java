package ru.itsjava.exercises.collection.lists.immutablelists;

import java.util.*;

public class ImmutableListsPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptyList()
        List list1 = Collections.emptyList();
//Проверить можно ли добавить туда элемент? - exception!
//        list1.add(1);
//Создать список с помощью метода singletonList()
        String str = "hahaha";
        List list2 = Collections.singletonList(str);
//Проверить можно ли добавить туда элемент? - exception!
//        list2.add("hello");
//        System.out.println(list2);
//Создать копию списка с помощью метода copyOf() - копирует
        List listOfCopy = List.copyOf(list2);
        System.out.println("listOfCopy = " + listOfCopy);
//Проверить можно ли добавить туда элемент? - no
//        listOfCopy.add("new hahaha");
//Создать копию списка с помощью метода unmodifiableList()
        List listOfCopy2 = Collections.unmodifiableList(listOfCopy);
//Проверить можно ли добавить туда элемент? - no
//        listOfCopy2.add("add?");
//Проверить можно ли добавить в исходный список элемент?
//        ?
//Создать копию списка с помощью метода nCopies()
        List listOfCopy3 = Collections.nCopies(2, listOfCopy2);
//Проверить можно ли добавить туда элемент? - no
        listOfCopy3.add("add?");
    }
}
