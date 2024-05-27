package com.exercises.dequeue;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // total number of integers
        int m = scanner.nextInt(); // size of the subarray
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // To find the maximum number of unique integers in any subarray of size m
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            deque.addLast(arr[i]);
            set.add(arr[i]);

            if (deque.size() == m + 1) {
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, set.size());
            }
        }

        System.out.println(maxUnique);

        scanner.close();
    }
}
