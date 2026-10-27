
package fi.arch26.triputils;

public class TripCalculator {

    public static double calculateCost(double distanceKm, double ratePerKm) {
        return distanceKm * ratePerKm;
    }

    // New functionality in version 1.1
    public static double calculateCostWithBaseFare(
            double distanceKm, double ratePerKm, double baseFare) {
        return baseFare + (distanceKm * ratePerKm);
    }
}
