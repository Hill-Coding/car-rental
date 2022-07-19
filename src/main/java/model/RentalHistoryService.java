package model;

import java.util.List;

public class RentalHistoryService {

    private final RentalHistoryRepository rentalHistoryRepository;

    public RentalHistoryService(RentalHistoryRepository rentalHistoryRepository) {
        this.rentalHistoryRepository = rentalHistoryRepository;
    }

    // TODO
    public List<Rent> forCustomer(Customer customer) {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    public List<Rent> forCar(Car car) {
        throw new RuntimeException("Not implemented yet");
    }
}
