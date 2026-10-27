
package taxicars;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void showCars() {
        for (Car car : cars) {
            System.out.println(car.getDescription());
        }
    }
}
