package rent;

import car.model.Car;
import customer.model.Customer;

import java.util.List;

public class RentalHistoryService {

    private List<Rent> rentalHistory;

    public List<Rent> getRentalHistory() {
        return rentalHistory;
    }

    // TODO
    public void forCustomer(Customer customer) {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    public void forCar(Car car) {
        throw new RuntimeException("Not implemented yet");
    }
}
