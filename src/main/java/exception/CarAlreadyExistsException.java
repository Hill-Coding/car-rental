package exception;

import model.car.Car;

public class CarAlreadyExistsException extends RuntimeException {

    public CarAlreadyExistsException(Car car) {
        super(car + " already exists");
    }
}
