package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        System.out.println(firstQueue);
        System.out.println(secondQueue);
        ArrayDeque<Integer> card = new ArrayDeque<>();
        card.add(firstQueue.remove());
        card.add(firstQueue.remove());
        card.add(secondQueue.remove());
        card.add(secondQueue.remove());


        while (!firstQueue.isEmpty() | !secondQueue.isEmpty()) {
            firstQueue.add(card.remove());
            secondQueue.add(card.remove());
            card.add(firstQueue.remove());
            card.add(firstQueue.remove());
            card.add(secondQueue.remove());
            card.add(secondQueue.remove());

        }
        System.out.println(card);
        return card;
    }
}
