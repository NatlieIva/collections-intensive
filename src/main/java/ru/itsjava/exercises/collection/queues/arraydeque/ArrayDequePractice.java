package ru.itsjava.exercises.collection.queues.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequePractice {

    public static void main(String[] args) {
//Создать queue и queue с помощью ArrayDeque
//Воспользоваться методами push pop и add remove
// для добавления и удаления элементов

        Deque <String> queue = new ArrayDeque();
        Deque <String> stack = new ArrayDeque();

        queue.add("add one");
        queue.add("add two");
        queue.add("add three");
        System.out.println("queue = " + queue);

// добавляет в самое начало очереди
        stack.push("push one");
        stack.push("push two");
        stack.push("push three");
        System.out.println("stack = " + stack);

//оба удяляют первый элемент
        queue.remove();
        System.out.println("queue.remove() = " + queue);
        stack.pop();
        System.out.println("stack.pop() = " + stack);
    }
}
