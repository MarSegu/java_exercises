package com.exercises.set;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set set = new HashSet<>();

        String[] pairs = new String[t];
        for(int x = 0; x<t ; x++){
            pairs[x] = pair_left[x] + " " + pair_right[x];
            set.add(pairs[x]);
            System.out.println(set.size());
        }
    }
}