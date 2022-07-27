package app;

import model.*;

class CarRentalControl {

    private final CarService carService = new CarService();
    private final CustomerService customerService = new CustomerService();
    private final RentalService rentalService = new RentalService();

    // TODO implement method
    void controlLoop() {
        System.out.println("Test message");
    }
}
