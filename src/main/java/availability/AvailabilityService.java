package availability;

import car.model.Car;
import car.model.CarSegment;
import rent.Rent;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AvailabilityService {


    // fixme lists should be injected, not initialized
    private List<Car> cars = new ArrayList<>();
    private List<Rent> rents = new ArrayList<>();

    /**
     * Checks if specific Car is available for requested dates range.
     * @param car car to check
     * @param from starting date
     * @param to ending date
     * @return boolean
     */
    public boolean checkAvailability(Car car, LocalDateTime from, LocalDateTime to) {
        // todo check if method works
        // todo write unit tests
        return rents.stream()
                .filter(rent -> rent.getCar().equals(car))
                .noneMatch(rent -> isOverlapping(rent.getFrom(), from, rent.getTo(), to));
    }

    // todo implement method
    public static boolean checkAvailability(String vin, LocalDateTime from, LocalDateTime to) {
        // check if Car with specific VIN is available for requested dates
        // should return true if it is available or else return false
        // alternatively can return Optional with first car searched
        throw new RuntimeException("Not implemented yet");
    }

    // todo implement method
    public List<Car> checkAvailability(CarSegment carSegment, LocalDateTime from, LocalDateTime to) {
        // check if there is at least one car from specific segment available for requested dates
        // should return list of available cars or empty list
        // alternatively can return Optional with first car searched
        throw new RuntimeException("Not implemented yet");
    }

    public static boolean isOverlapping(LocalDateTime start1, LocalDateTime end1, LocalDateTime start2, LocalDateTime end2) {
        return start1.isBefore(end2) && start2.isBefore(end1);
    }
}
