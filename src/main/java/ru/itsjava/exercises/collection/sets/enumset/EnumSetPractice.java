package ru.itsjava.exercises.collection.sets.enumset;

import ru.itsjava.model.Day;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EnumSetPractice {

    public static void main(String[] args) {
        //Создать множества из enum day с помощью методов allOf noneOf и of
        EnumSet<Day> daySet = EnumSet.allOf(Day.class); // из всех эл-ов класса
        System.out.println("daySet = " + daySet);

        EnumSet<Day> daySetNoneOf = EnumSet.noneOf(Day.class); // пустое множество с зданным типом данных
        System.out.println("daySetNoneOf = " + daySetNoneOf);

        EnumSet<Day> daySetOf = EnumSet.of(Day.MONDAY, Day.SATURDAY);
        System.out.println("daySetOf = " + daySetOf);
    }
}