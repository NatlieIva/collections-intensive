package ru.itsjava.exercises.collection.queues.priorityqueue;

import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
// Создать очередь с именами с помощью PriorityQueue
// Удалять и вывести имена с помощью метода remove ;)
// Создать очередь с именами с помощью PriorityQueue в обратном порядке, используя Comparator
// Удалять и вывести имена с помощью метода remove ;)

        Queue <String> names = new PriorityQueue<>();
        names.add("Ann");
        names.add("Sophie");
        names.add("Liza");
        names.add("Kate");
        while (names.size() > 0)
            System.out.println(names.remove());

        PriorityQueue <String> namesReverse =
                new PriorityQueue<>(5,Collections.reverseOrder());
        System.out.println("With comparator:");
        namesReverse.offer("Ann");
        namesReverse.offer("Sophie");
        namesReverse.offer("Liza");
        namesReverse.offer("Kate");
        while (namesReverse.size() > 0)
            System.out.println(namesReverse.remove());

    }
}

