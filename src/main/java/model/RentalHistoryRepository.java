package model;

import java.util.List;

// TODO add class fields
// TODO add constructor
// TODO add getters and setters
public class RentalHistoryRepository {
    private List<Rent> rentalHistory;

    public List<Rent> forUser(User user) {
        return rentalHistory.stream()
                .filter(rent -> rent.getUser() == user)
                .toList();
    }

    // TODO
    public List<Rent> forCar(Car car) {
        throw new RuntimeException("Not implemented yet");
    }
}
