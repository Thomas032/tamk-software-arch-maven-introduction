
package fi.arch26.taxicars;

import fi.arch26.triputils.TripCalculator;

public class App {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addCar(new Car("Toyota", "Prius"));
        garage.addCar(new Car("Skoda", "Octavia"));
        garage.addCar(new Car("Tesla", "Model 3"));

        System.out.println("Cars in the garage:");
        garage.showCars();

        double distance = 15.0;
        double rate = 1.5;
        double baseFare = 5.0;

        double cost = TripCalculator.calculateCostWithBaseFare(
                distance, rate, baseFare);

        System.out.println("Trip cost: " + cost + " EUR");
    }
}
