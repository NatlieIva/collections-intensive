package ru.itsjava.exercises.collection.maps.immutablemaps;

import java.util.*;

public class ImmutableMapsPractice {

    public static void main(String[] args) {
//Создать пустой список с помощью метода emptyMap()
//Проверить можно ли добавить туда элемент? - no
        Map emptyMap = Collections.emptyMap();
//        emptyMap.put(1,"first");
//        System.out.println("emptyMap = " + emptyMap);

//Создать список с помощью метода singletonMap()
        Map singletonMap = Collections.singletonMap(2, "second");
//        singletonMap.put(3, "third");
//Проверить можно ли добавить туда элемент? - no

//Создать копию списка с помощью метода Map.ofEntries() это разве копия?
//Проверить можно ли добавить туда элемент? - no
        Map<String, String> mapOfEntries = Map.ofEntries(Map.entry("K1", "V1"));
//        mapOfEntries.put("K2", "V2");
//Создать копию списка с помощью метода unmodifiableMap()
//Проверить можно ли добавить туда элемент? - no
//Проверить можно ли добавить в исходный список элемент? -yes
        Map<String, String> newMap = new HashMap<>();
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(newMap);
//        unmodifiableMap.put("K3","V3");
        newMap.put("K3", "V3");

    }
}
