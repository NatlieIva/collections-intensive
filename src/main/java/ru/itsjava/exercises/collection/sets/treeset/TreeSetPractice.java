package ru.itsjava.exercises.collection.sets.treeset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
//Создать TreeSet
        NavigableSet <String> treeSet = new TreeSet();
//Добавить элементы  "1" , "4", "5", "7", "9", "3"
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("5");
        treeSet.add("7");
        treeSet.add("9");
        treeSet.add("3");
//Вывести множество на экран
        System.out.println("treeSet = " + treeSet);
//Вывести элемент больше 3 на экран
        System.out.println("treeSet.higher(\"3\") = " + treeSet.higher("3"));
//Вывести элемент меньше 3 на экран
        System.out.println("treeSet.lower(\"6\") = " + treeSet.lower("6"));
//создать множество в обратном порядке
        System.out.println("treeSet.descendingSet() = " + treeSet.descendingSet());
//возвращаем множество в котором все элементы больше или равны текущего
        System.out.println("treeSet.tailSet(7) = " + treeSet.tailSet("7"));

    }
}