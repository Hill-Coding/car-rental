package model;

import java.util.List;

// TODO add class fields
// TODO add constructor
// TODO add getters and setters
// TODO add equals and hashcode
// TODO add toString
public class RentalHistoryService {

    private final RentalHistoryRepository rentalHistoryRepository;

    public RentalHistoryService(RentalHistoryRepository rentalHistoryRepository) {
        this.rentalHistoryRepository = rentalHistoryRepository;
    }

    // TODO
    List<Rent> userRentalHistory(User user) {
        throw new RuntimeException("Not implemented yet");
    }

    // TODO
    List<Rent> carRentalHistory(Car car) {
        throw new RuntimeException("Not implemented yet");
    }
}
