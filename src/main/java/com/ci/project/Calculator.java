package com.ci.project;

import java.util.Arrays;

public class Calculator {

    // INTENTIONALLY BROKEN FOR TDD
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Calculates the mean average of an array of numbers.
     */
    public double calculateMean(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Calculates the sample standard deviation of an array of numbers.
     * Showcasing a more complex operation for Task 3 requirements.
     */
    public double calculateStandardDeviation(double[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0.0;
        }
        double mean = calculateMean(numbers);
        double varianceSum = 0;

        for (double num : numbers) {
            varianceSum += Math.pow(num - mean, 2);
        }

        // Sample standard deviation uses N-1
        double variance = varianceSum / (numbers.length - 1);
        return Math.sqrt(variance);
    }
}
