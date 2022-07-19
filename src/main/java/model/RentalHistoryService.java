package model;

import java.util.List;

// TODO add getters and setters
public class RentalHistoryService {

    private final RentalHistoryRepository rentalHistoryRepository;

    public RentalHistoryService(RentalHistoryRepository rentalHistoryRepository) {
        this.rentalHistoryRepository = rentalHistoryRepository;
    }

    List<Rent> userRentalHistory(User user) {
        return rentalHistoryRepository.forUser(user);
    }

    List<Rent> carRentalHistory(Car car) {
        return rentalHistoryRepository.forCar(car);
    }
}
