package com.ci.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration Tests (IT).
 * These execute automatically during the `verify` phase
 * via the maven-failsafe-plugin.
 * 
 * It ensures the modules work correctly in sequence.
 */
public class CalculatorIT {

    @Test
    public void testSequentialOperationsWithStandardDeviation() {
        Calculator calc = new Calculator();

        // Simulating an integration of features
        // Step 1: Use basic features to build an array
        double val1 = calc.add(5, 5); // 10
        double val2 = calc.subtract(20, 5); // 15
        double val3 = calc.multiply(4, 5); // 20
        double val4 = calc.divide(50, 2); // 25

        double[] results = { val1, val2, val3, val4 };

        // Step 2: Ensure the mean calculates properly from the integrated results
        double mean = calc.calculateMean(results);
        assertEquals(17.5, mean, 0.001, "Mean of 10, 15, 20, 25 should be 17.5");

        // Step 3: Ensure the Standard Deviation integrates with the results array
        double stdDev = calc.calculateStandardDeviation(results);
        assertEquals(6.45497, stdDev, 0.001, "Standard deviation should be approx 6.45");
    }
}
