package ru.itsjava.solutions.collection.maps.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
//        Создать LinkedHashMap (String Integer).
//        Добавить 5 элементов и взять entrySet.
//        Пробежаться итератором по множеству и вывести на экран элемент и ключ
//
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);
        linkedHashMap.put("five", 5);

        Set<Map.Entry<String, Integer>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> item = iterator.next();
            System.out.println("Key = " + item.getKey() + " Value = " + item.getValue());
        }
    }
}
