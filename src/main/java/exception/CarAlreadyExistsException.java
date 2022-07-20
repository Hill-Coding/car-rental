package exception;

import model.Car;

public class CarAlreadyExistsException extends RuntimeException {

    public CarAlreadyExistsException(Car car) {
        super(car + " already exists");
    }
}
