package com.exercises.streams;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .sum();
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int sumOfDivisors = myCalculator.divisor_sum(6);
        System.out.println("Sum of divisors: " + sumOfDivisors); // Output: Sum of divisors: 12
    }
}

