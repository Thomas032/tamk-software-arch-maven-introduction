
package fi.arch26.triputils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripCalculatorTest {

    @Test
    void testBasicTripCost() {
        double cost = TripCalculator.calculateCost(10, 2);
        assertEquals(20.0, cost, 0.001);
    }

    @Test
    void testTripCostWithBaseFare() {
        double cost = TripCalculator.calculateCostWithBaseFare(10, 2, 5);
        assertEquals(25.0, cost, 0.001);
    }

    @Test
    void testZeroDistance() {
        double cost = TripCalculator.calculateCost(0, 2);
        assertEquals(0.0, cost, 0.001);
    }

    @Test
    void testBaseFareWithZeroDistance() {
        double cost = TripCalculator.calculateCostWithBaseFare(0, 2, 5);
        assertEquals(5.0, cost, 0.001);
    }
}
