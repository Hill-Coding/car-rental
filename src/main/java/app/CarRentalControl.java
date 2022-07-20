package app;

import model.*;

class CarRentalControl {

    private final CarService carService = new CarService(new CarRepository());
    private final CustomerService customerService = new CustomerService(new CustomerRepository());
    private final RentalService rentalService = new RentalService();

    // TODO implement method
    void controlLoop() {
        System.out.println("Test message");
    }
}
