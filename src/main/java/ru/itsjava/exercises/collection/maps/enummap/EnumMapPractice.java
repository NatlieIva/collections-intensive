package ru.itsjava.exercises.collection.maps.enummap;

import ru.itsjava.model.Day;

import java.util.AbstractMap.SimpleEntry;
import java.util.EnumMap;

public class EnumMapPractice {

    public static void main(String[] args) {
        //Создать EnumMap ключ - день значение - активность

        EnumMap<Day, String> activity = new EnumMap(Day.class);

        activity.put(Day.MONDAY, "reading");
        activity.put(Day.FRIDAY, "do sport");

        //положить по ключу несколько активностей и проверить, что они есть

        System.out.println("activity = " + activity);
    }
}
