package ru.itsjava.exercises.collection.lists.arraysaslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListPractice {

    public static void main(String[] args) {
        //Создать список из элементов One, Two, Three
        List<String> strList = Arrays.asList("One", "Two", "Tree");
        List<String> strArrayList = new ArrayList<>();
        strArrayList.addAll(strList);

        //Добавить элемент Four
        strArrayList.add("Four");

        //Заменить один из элементов на Four и вывести на экран
        strArrayList.set(1, "Four");
        System.out.println("strArrayList = " + strArrayList);
    }
}
