
package taxicars;

public class App {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addCar(new Car("Toyota", "Prius"));
        garage.addCar(new Car("Skoda", "Octavia"));
        garage.addCar(new Car("Tesla", "Model 3"));

        System.out.println("Cars in the garage:");
        garage.showCars();
    }
}
