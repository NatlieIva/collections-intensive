package ru.itsjava.exercises.collection.maps.linkedhashmap;

import java.util.*;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
//        Создать LinkedHashMap (String Integer).
//        Добавить 5 элементов и взять entrySet.
//        Пробежаться итератором по множеству и вывести на экран элемент и ключ

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("K1", 1);
        linkedHashMap.put("K2", 2);
        linkedHashMap.put("K3", 3);
        linkedHashMap.put("K4", 4);
        linkedHashMap.put("K5", 5);
        linkedHashMap.entrySet();
        Set<Map.Entry<String, Integer>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("key= " + iterator.next().getKey() + "value= " + iterator.next().getValue());
        }
    }
}
