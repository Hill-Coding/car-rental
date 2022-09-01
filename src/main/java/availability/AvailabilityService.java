package availability;

import car.model.Car;
import car.model.CarSegment;
import rent.Rent;

import java.time.LocalDateTime;
import java.util.List;

public class AvailabilityService {

    // todo implement method
    public static boolean checkAvailability(CarSegment carSegment, LocalDateTime from, LocalDateTime to) {
        // check if there is at least one car available for requested dates
        // if there is no available car return false
        // if some car is available return true
        throw new RuntimeException("Not implemented yet");
    }

    // todo implement method
    public static boolean checkAvailability(Car car, LocalDateTime from, LocalDateTime to) {
        // check if there is at least one car available for requested dates
        // if there is no available car return false
        // if some car is available return true
        throw new RuntimeException("Not implemented yet");
    }

    // todo implement method
    public static boolean checkAvailability(String vin, LocalDateTime from, LocalDateTime to) {
        // check if there is at least one car available for requested dates
        // if there is no available car return false
        // if some car is available return true
        throw new RuntimeException("Not implemented yet");
    }

    // maybe this should return list of available cars
    public static boolean isAnyCarAvailableForDates(List<Rent> rents, LocalDateTime from, LocalDateTime to) {
        return rents.stream()
                .anyMatch(rent -> isOverlapping(rent.getFrom(), from, rent.getTo(), to));
    }

    public static boolean isOverlapping(LocalDateTime start1, LocalDateTime end1, LocalDateTime start2, LocalDateTime end2) {
        return start1.isBefore(end2) && start2.isBefore(end1);
    }
}
