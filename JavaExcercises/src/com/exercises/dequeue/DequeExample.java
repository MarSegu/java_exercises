package com.exercises.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque instance using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.addFirst("A"); // Add to the front
        deque.addLast("B");  // Add to the back
        deque.offerFirst("C"); // Add to the front
        deque.offerLast("D");  // Add to the back

        // Print the deque
        System.out.println("Deque after adding elements: " + deque);

        // Access elements from the deque
        String firstElement = deque.peekFirst(); // Get the first element
        String lastElement = deque.peekLast();   // Get the last element
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove elements from the deque
        String removedFirst = deque.pollFirst(); // Remove the first element
        String removedLast = deque.pollLast();   // Remove the last element
        System.out.println("Removed First: " + removedFirst);
        System.out.println("Removed Last: " + removedLast);

        // Print the deque after removals
        System.out.println("Deque after removing elements: " + deque);

        // Iterate through the deque
        System.out.println("Iterating through the deque:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
