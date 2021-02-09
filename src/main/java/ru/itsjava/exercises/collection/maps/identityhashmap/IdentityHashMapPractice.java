package ru.itsjava.exercises.collection.maps.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapPractice {

    public static void main(String[] args) {
        //Создать IdentityHashMap (тип строка-строка)
        //и добавить 2 разных элемента и одинаковые по значению (new String() и "")
        IdentityHashMap<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String(), "");
        identityHashMap.put(new String(), "");
        System.out.println("identityHashMap.size() = " + identityHashMap.size());
        //вывести размер map
    }
}
