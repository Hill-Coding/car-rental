package model;

import exception.CarAlreadyExistsException;
import model.car.Car;

import java.util.List;

public class CarService {

    private List<Car> cars;

    void addCar(Car car) {
        if (cars.contains(car)) {
            throw new CarAlreadyExistsException(car);
        }
        cars.add(car);
    }

    // TODO
    void deleteCar() {

    }
}
