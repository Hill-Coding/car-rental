package exception;

import car.model.Car;

public class CarAlreadyExistsException extends RuntimeException {

    public CarAlreadyExistsException(Car car) {
        super(car + " already exists");
    }
}
